package me.villagerunknown.coinbanks.feature;

import me.villagerunknown.coinbanks.block.JarCoinBankBlock;
import me.villagerunknown.coinbanks.block.PiggyBankBlock;
import me.villagerunknown.coinbanks.block.entity.CoinBankBlockEntity;
import me.villagerunknown.coinbanks.block.CoinBankBlock;
import me.villagerunknown.coinbanks.block.CoinBankBlocks;
import me.villagerunknown.villagercoin.block.entity.AbstractCoinBankBlockEntity;
import me.villagerunknown.villagercoin.feature.CoinBankBlocksFeature;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;

public class CoinBankBlocksFeatureLoader {

	public static final BlockEntityType<CoinBankBlockEntity> COIN_BANK_BLOCK_ENTITY_TYPE = (BlockEntityType<CoinBankBlockEntity>) registerCoinBankBlockEntities();
	
	public static void execute(){
		new CoinBankBlocks();
	}
	
	private static BlockEntityType<? extends AbstractCoinBankBlockEntity> registerCoinBankBlockEntities() {
		BlockEntityType.Builder<CoinBankBlockEntity> builder = BlockEntityType.Builder.create(
				CoinBankBlockEntity::new,
				CoinBankBlocks.TERRACOTTA_COIN_BANK,
				CoinBankBlocks.ORANGE_TERRACOTTA_COIN_BANK,
				CoinBankBlocks.MAGENTA_TERRACOTTA_COIN_BANK,
				CoinBankBlocks.LIGHT_BLUE_TERRACOTTA_COIN_BANK,
				CoinBankBlocks.YELLOW_TERRACOTTA_COIN_BANK,
				CoinBankBlocks.LIME_TERRACOTTA_COIN_BANK,
				CoinBankBlocks.PINK_TERRACOTTA_COIN_BANK,
				CoinBankBlocks.GRAY_TERRACOTTA_COIN_BANK,
				CoinBankBlocks.LIGHT_GRAY_TERRACOTTA_COIN_BANK,
				CoinBankBlocks.CYAN_TERRACOTTA_COIN_BANK,
				CoinBankBlocks.PURPLE_TERRACOTTA_COIN_BANK,
				CoinBankBlocks.BLUE_TERRACOTTA_COIN_BANK,
				CoinBankBlocks.BROWN_TERRACOTTA_COIN_BANK,
				CoinBankBlocks.GREEN_TERRACOTTA_COIN_BANK,
				CoinBankBlocks.RED_TERRACOTTA_COIN_BANK,
				CoinBankBlocks.BLACK_TERRACOTTA_COIN_BANK,
				CoinBankBlocks.COLD_PIGGY_BANK_BLOCK,
				CoinBankBlocks.TEMPERATE_PIGGY_BANK_BLOCK,
				CoinBankBlocks.WARM_PIGGY_BANK_BLOCK
		);
		
		return CoinBankBlocksFeature.registerCoinBankBlockEntities( builder );
	}
	
	public static Block registerCoinBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( id, new CoinBankBlock( AbstractBlock.Settings.create() ) );
	}
	
	public static Block registerJarCoinBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( id, new JarCoinBankBlock( AbstractBlock.Settings.create() ) );
	}
	
	public static Block registerPiggyBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( id, new PiggyBankBlock( AbstractBlock.Settings.create() ) );
	}
	
}
