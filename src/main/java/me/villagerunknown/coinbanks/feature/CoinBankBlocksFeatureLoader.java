package me.villagerunknown.coinbanks.feature;

import me.villagerunknown.coinbanks.block.*;
import me.villagerunknown.coinbanks.block.entity.CoinBankBlockEntity;
import me.villagerunknown.villagercoin.block.entity.AbstractCurrencyValueBlockEntity;
import me.villagerunknown.villagercoin.feature.CoinBankBlocksFeature;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;

public class CoinBankBlocksFeatureLoader {

	public static final BlockEntityType<CoinBankBlockEntity> COIN_COIN_BANK_ENTITY_TYPE = (BlockEntityType<CoinBankBlockEntity>) registerCoinBankBlockEntities();
	
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
				CoinBankBlocks.COPPER_COIN_BANK,
				CoinBankBlocks.IRON_COIN_BANK,
				CoinBankBlocks.GOLD_COIN_BANK,
				CoinBankBlocks.EMERALD_COIN_BANK,
				CoinBankBlocks.NETHERITE_COIN_BANK,
				CoinBankBlocks.OBSIDIAN_COIN_BANK,
				CoinBankBlocks.CRYING_OBSIDIAN_COIN_BANK,
				CoinBankBlocks.COLD_PIG_COIN_BANK,
				CoinBankBlocks.TEMPERATE_PIG_COIN_BANK,
				CoinBankBlocks.WARM_PIG_COIN_BANK,
				CoinBankBlocks.PIGLIN_COIN_BANK,
				CoinBankBlocks.ZOMBIFIED_PIGLIN_COIN_BANK,
				CoinBankBlocks.WHITE_SHEEP_COIN_BANK,
				CoinBankBlocks.ORANGE_SHEEP_COIN_BANK,
				CoinBankBlocks.MAGENTA_SHEEP_COIN_BANK,
				CoinBankBlocks.LIGHT_BLUE_SHEEP_COIN_BANK,
				CoinBankBlocks.YELLOW_SHEEP_COIN_BANK,
				CoinBankBlocks.LIME_SHEEP_COIN_BANK,
				CoinBankBlocks.PINK_SHEEP_COIN_BANK,
				CoinBankBlocks.GRAY_SHEEP_COIN_BANK,
				CoinBankBlocks.LIGHT_GRAY_SHEEP_COIN_BANK,
				CoinBankBlocks.CYAN_SHEEP_COIN_BANK,
				CoinBankBlocks.PURPLE_SHEEP_COIN_BANK,
				CoinBankBlocks.BLUE_SHEEP_COIN_BANK,
				CoinBankBlocks.BROWN_SHEEP_COIN_BANK,
				CoinBankBlocks.GREEN_SHEEP_COIN_BANK,
				CoinBankBlocks.RED_SHEEP_COIN_BANK,
				CoinBankBlocks.BLACK_SHEEP_COIN_BANK,
				CoinBankBlocks.COW_COIN_BANK,
				CoinBankBlocks.RED_MOOSHROOM_COIN_BANK,
				CoinBankBlocks.BROWN_MOOSHROOM_COIN_BANK,
				CoinBankBlocks.BEE_COIN_BANK,
				CoinBankBlocks.ANGRY_BEE_COIN_BANK,
				CoinBankBlocks.RAVAGER_COIN_BANK,
				CoinBankBlocks.GUARDIAN_COIN_BANK,
				CoinBankBlocks.ELDER_GUARDIAN_COIN_BANK
		);
		
		return CoinBankBlocksFeature.registerCoinBankBlockEntities( builder );
	}
	
	public static Block registerCoinBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( id, new CoinBankBlock( AbstractBlock.Settings.create().breakInstantly() ) );
	}
	
	public static Block registerFireproofCoinBankBlock( String id ) {
		return CoinBankBlocksFeature.registerFireproofCoinBankBlock( id, new CoinBankBlock( AbstractBlock.Settings.create().breakInstantly() ) );
	}
	
	public static Block registerJarCoinBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( id, new JarCoinBankBlock( AbstractBlock.Settings.create().breakInstantly() ) );
	}
	
	public static Block registerToughJarCoinBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( id, new ToughJarCoinBankBlock( AbstractBlock.Settings.create() ) );
	}
	
	public static Block registerToughFireproofJarCoinBankBlock( String id ) {
		return CoinBankBlocksFeature.registerFireproofCoinBankBlock( id, new ToughJarCoinBankBlock( AbstractBlock.Settings.create() ) );
	}
	
	public static Block registerPiggyBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( id, new PiggyBankBlock( AbstractBlock.Settings.create().breakInstantly() ) );
	}
	
	public static Block registerSheepBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( id, new SheepBankBlock( AbstractBlock.Settings.create().breakInstantly() ) );
	}
	
	public static Block registerCowBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( id, new CowBankBlock( AbstractBlock.Settings.create().breakInstantly() ) );
	}
	
	public static Block registerBeeBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( id, new BeeBankBlock( AbstractBlock.Settings.create().breakInstantly() ) );
	}
	
	public static Block registerRavagerBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( id, new RavagerBankBlock( AbstractBlock.Settings.create().breakInstantly() ) );
	}
	
	public static Block registerGuardianBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( id, new GuardianBankBlock( AbstractBlock.Settings.create().breakInstantly() ) );
	}
	
}
