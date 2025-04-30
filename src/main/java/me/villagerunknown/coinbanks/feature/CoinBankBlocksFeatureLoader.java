package me.villagerunknown.coinbanks.feature;

import me.villagerunknown.coinbanks.block.*;
import me.villagerunknown.coinbanks.block.entity.CoinBankBlockEntity;
import me.villagerunknown.villagercoin.block.entity.AbstractCurrencyValueBlockEntity;
import me.villagerunknown.villagercoin.feature.CoinBankBlocksFeature;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;

public class CoinBankBlocksFeatureLoader {

	public static final BlockEntityType<CoinBankBlockEntity> COIN_BANK_BLOCK_ENTITY_TYPE = (BlockEntityType<CoinBankBlockEntity>) registerCoinBankBlockEntities();
	
	public static void execute(){
		new CoinBankBlocks();
	}
	
	private static BlockEntityType<? extends AbstractCurrencyValueBlockEntity> registerCoinBankBlockEntities() {
		BlockEntityType.Builder<CoinBankBlockEntity> builder = BlockEntityType.Builder.create(
				CoinBankBlockEntity::new,
				CoinBankBlocks.TERRACOTTA_COIN_BANK,
				CoinBankBlocks.WHITE_TERRACOTTA_COIN_BANK,
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
				CoinBankBlocks.WARM_PIGGY_BANK_BLOCK,
				CoinBankBlocks.PIGLIN_BANK_BLOCK,
				CoinBankBlocks.ZOMBIFIED_PIGLIN_BANK_BLOCK,
				CoinBankBlocks.WHITE_SHEEP_BANK_BLOCK,
				CoinBankBlocks.ORANGE_SHEEP_BANK_BLOCK,
				CoinBankBlocks.MAGENTA_SHEEP_BANK_BLOCK,
				CoinBankBlocks.LIGHT_BLUE_SHEEP_BANK_BLOCK,
				CoinBankBlocks.YELLOW_SHEEP_BANK_BLOCK,
				CoinBankBlocks.LIME_SHEEP_BANK_BLOCK,
				CoinBankBlocks.PINK_SHEEP_BANK_BLOCK,
				CoinBankBlocks.GRAY_SHEEP_BANK_BLOCK,
				CoinBankBlocks.LIGHT_GRAY_SHEEP_BANK_BLOCK,
				CoinBankBlocks.CYAN_SHEEP_BANK_BLOCK,
				CoinBankBlocks.PURPLE_SHEEP_BANK_BLOCK,
				CoinBankBlocks.BLUE_SHEEP_BANK_BLOCK,
				CoinBankBlocks.BROWN_SHEEP_BANK_BLOCK,
				CoinBankBlocks.GREEN_SHEEP_BANK_BLOCK,
				CoinBankBlocks.RED_SHEEP_BANK_BLOCK,
				CoinBankBlocks.BLACK_SHEEP_BANK_BLOCK,
				CoinBankBlocks.COW_BANK_BLOCK,
				CoinBankBlocks.RED_MOOSHROOM_BANK_BLOCK,
				CoinBankBlocks.BROWN_MOOSHROOM_BANK_BLOCK,
				CoinBankBlocks.BEE_BANK_BLOCK,
				CoinBankBlocks.ANGRY_BEE_BANK_BLOCK
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
	
	public static Block registerSheepBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( id, new SheepBankBlock( AbstractBlock.Settings.create() ) );
	}
	
	public static Block registerCowBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( id, new CowBankBlock( AbstractBlock.Settings.create() ) );
	}
	
	public static Block registerBeeBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( id, new BeeBankBlock( AbstractBlock.Settings.create() ) );
	}
	
}
