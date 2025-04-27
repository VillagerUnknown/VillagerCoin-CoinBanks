package me.villagerunknown.coinbanks.block;

import com.mojang.serialization.MapCodec;
import me.villagerunknown.coinbanks.block.entity.CoinBankBlockEntity;
import me.villagerunknown.villagercoin.block.AbstractCoinBankBlock;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;

public class CoinBankBlock extends AbstractCoinBankBlock {
	
	public static final MapCodec<CoinBankBlock> CODEC = createCodec(CoinBankBlock::new);

	public CoinBankBlock(AbstractBlock.Settings settings) {
		super(settings);
	}
	
	@Override
	protected MapCodec<CoinBankBlock> getCodec() {
		return CODEC;
	}
	
	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new CoinBankBlockEntity(pos, state);
	}
	
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
		return (BlockState)this.getDefaultState().with(WATERLOGGED, Boolean.valueOf(fluidState.getFluid() == Fluids.WATER));
	}
	
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(new Property[]{WATERLOGGED});
	}
	
}
