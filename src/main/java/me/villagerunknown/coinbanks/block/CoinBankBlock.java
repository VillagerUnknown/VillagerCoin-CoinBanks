package me.villagerunknown.coinbanks.block;

import com.mojang.serialization.MapCodec;
import me.villagerunknown.coinbanks.block.entity.CoinBankBlockEntity;
import me.villagerunknown.villagercoin.block.AbstractCoinBankBlock;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
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
	
}
