package me.villagerunknown.coinbanks.block;

import com.google.common.collect.ImmutableMap;
import me.villagerunknown.villagercoin.block.CoinBankBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.function.Function;

public class CubeBankBlock extends CoinBankBlock {
	
	protected static final VoxelShape SHAPE= Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
	
	public static final DirectionProperty FACING;
	
	public CubeBankBlock(Settings settings) {
		super(
				settings
						.nonOpaque()
		);
	}
	
	@Override
	protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		ItemActionResult result = super.onUseWithItem(stack, state, world, pos, player, hand, hit);
		
		if( result.equals( ItemActionResult.CONSUME ) ) {
			MinecraftServer server = world.getServer();
			if( null != server ) {
				ServerWorld serverWorld = server.getWorld(world.getRegistryKey());
				if( null != serverWorld ) {
					SimpleParticleType particleType = ParticleTypes.DUST_PLUME;
					
					if( state.get(WATERLOGGED) ) {
						particleType = ParticleTypes.BUBBLE;
					} // if
					
					serverWorld.spawnParticles(particleType, (double) pos.getX() + (double) 0.5F, (double) pos.getY() + 0.6, (double) pos.getZ() + (double) 0.5F, 7, (double) 0.0F, (double) 0.0F, (double) 0.0F, (double) 0.0F);
				} // if
			} // if
		} // if
		
		return result;
	}
	
	@Override
	protected ImmutableMap<BlockState, VoxelShape> getShapesForStates(Function<BlockState, VoxelShape> stateToShape) {
		HashMap<BlockState, VoxelShape> shapes = new HashMap<>();
		
		shapes.put( stateManager.getDefaultState().with(FACING, Direction.NORTH), SHAPE );
		shapes.put( stateManager.getDefaultState().with(FACING, Direction.EAST), SHAPE );
		shapes.put( stateManager.getDefaultState().with(FACING, Direction.SOUTH), SHAPE );
		shapes.put( stateManager.getDefaultState().with(FACING, Direction.WEST), SHAPE );
		
		return ImmutableMap.<BlockState, VoxelShape>builder().putAll( shapes ).build();
	}
	
	protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return SHAPE;
	}
	
	@Override
	protected BlockState rotate(BlockState state, BlockRotation rotation) {
		return state.with(FACING, rotation.rotate(state.get(FACING)));
	}
	
	@Override
	protected BlockState mirror(BlockState state, BlockMirror mirror) {
		return state.rotate(mirror.getRotation(state.get(FACING)));
	}
	
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
		return (BlockState)this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing()).with(WATERLOGGED, Boolean.valueOf(fluidState.getFluid() == Fluids.WATER));
	}
	
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(new Property[]{FACING,WATERLOGGED});
	}
	
	static {
		FACING = Properties.HORIZONTAL_FACING;
	}
	
}
