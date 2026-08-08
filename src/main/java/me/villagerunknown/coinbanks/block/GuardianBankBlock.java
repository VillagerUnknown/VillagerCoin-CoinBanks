package me.villagerunknown.coinbanks.block;

import com.google.common.collect.ImmutableMap;
import me.villagerunknown.villagercoin.block.CoinBankBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import java.util.HashMap;
import java.util.function.Function;

public class GuardianBankBlock extends CoinBankBlock {
	
	protected static final VoxelShape SHAPE= Block.box(3.0, 0.0, 3.0, 13.0, 10.0, 14.0);
	
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
	
	public GuardianBankBlock(Properties settings) {
		super(
				settings
						.noOcclusion()
		);
	}
	
	@Override
	protected InteractionResult useItemOn(ItemStack stack, BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
		InteractionResult result = super.useItemOn(stack, state, world, pos, player, hand, hit);
		
		if( result.equals( InteractionResult.CONSUME ) ) {
			MinecraftServer server = world.getServer();
			if( null != server ) {
				ServerLevel serverWorld = server.getLevel(world.dimension());
				if( null != serverWorld ) {
					SimpleParticleType particleType = ParticleTypes.DUST_PLUME;
					
					if( state.getValue(WATERLOGGED) ) {
						particleType = ParticleTypes.BUBBLE;
					} // if
					
					serverWorld.sendParticles(particleType, (double) pos.getX() + (double) 0.5F, (double) pos.getY() + 0.6, (double) pos.getZ() + (double) 0.5F, 7, (double) 0.0F, (double) 0.0F, (double) 0.0F, (double) 0.0F);
				} // if
			} // if
		} // if
		
		return result;
	}
	
	protected ImmutableMap<BlockState, VoxelShape> getShapesForStates(Function<BlockState, VoxelShape> stateToShape) {
		HashMap<BlockState, VoxelShape> shapes = new HashMap<>();
		
		shapes.put( stateDefinition.any().setValue(FACING, Direction.NORTH), SHAPE );
		shapes.put( stateDefinition.any().setValue(FACING, Direction.EAST), SHAPE );
		shapes.put( stateDefinition.any().setValue(FACING, Direction.SOUTH), SHAPE );
		shapes.put( stateDefinition.any().setValue(FACING, Direction.WEST), SHAPE );
		
		return ImmutableMap.<BlockState, VoxelShape>builder().putAll( shapes ).build();
	}
	
	protected VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return SHAPE;
	}
	
	@Override
	protected BlockState rotate(BlockState state, Rotation rotation) {
		return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
	}
	
	@Override
	protected BlockState mirror(BlockState state, Mirror mirror) {
		return state.rotate(mirror.getRotation(state.getValue(FACING)));
	}
	
	public BlockState getStateForPlacement(BlockPlaceContext ctx) {
		FluidState fluidState = ctx.getLevel().getFluidState(ctx.getClickedPos());
		return (BlockState)this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection()).setValue(WATERLOGGED, Boolean.valueOf(fluidState.getType() == Fluids.WATER));
	}
	
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(new Property[]{FACING,WATERLOGGED});
	}
	
}
