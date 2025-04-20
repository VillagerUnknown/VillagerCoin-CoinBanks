package me.villagerunknown.coinbanks.block;

import me.villagerunknown.coinbanks.feature.CoinBankBlocksFeatureLoader;
import net.minecraft.block.Block;

public class CoinBankBlocks {
	
	public static final Block TERRACOTTA_COIN_BANK;
	public static final Block WHITE_TERRACOTTA_COIN_BANK;
	public static final Block ORANGE_TERRACOTTA_COIN_BANK;
	public static final Block MAGENTA_TERRACOTTA_COIN_BANK;
	public static final Block LIGHT_BLUE_TERRACOTTA_COIN_BANK;
	public static final Block YELLOW_TERRACOTTA_COIN_BANK;
	public static final Block LIME_TERRACOTTA_COIN_BANK;
	public static final Block PINK_TERRACOTTA_COIN_BANK;
	public static final Block GRAY_TERRACOTTA_COIN_BANK;
	public static final Block LIGHT_GRAY_TERRACOTTA_COIN_BANK;
	public static final Block CYAN_TERRACOTTA_COIN_BANK;
	public static final Block PURPLE_TERRACOTTA_COIN_BANK;
	public static final Block BLUE_TERRACOTTA_COIN_BANK;
	public static final Block BROWN_TERRACOTTA_COIN_BANK;
	public static final Block GREEN_TERRACOTTA_COIN_BANK;
	public static final Block RED_TERRACOTTA_COIN_BANK;
	public static final Block BLACK_TERRACOTTA_COIN_BANK;
	
	public static final Block COLD_PIGGY_BANK_BLOCK;
	public static final Block TEMPERATE_PIGGY_BANK_BLOCK;
	public static final Block WARM_PIGGY_BANK_BLOCK;
	
	public CoinBankBlocks(){}
	
	static{
		TERRACOTTA_COIN_BANK = CoinBankBlocksFeatureLoader.registerJarCoinBankBlock( "terracotta_coin_bank" );
		WHITE_TERRACOTTA_COIN_BANK = CoinBankBlocksFeatureLoader.registerJarCoinBankBlock( "white_terracotta_coin_bank" );
		ORANGE_TERRACOTTA_COIN_BANK = CoinBankBlocksFeatureLoader.registerJarCoinBankBlock( "orange_terracotta_coin_bank" );
		MAGENTA_TERRACOTTA_COIN_BANK = CoinBankBlocksFeatureLoader.registerJarCoinBankBlock( "magenta_terracotta_coin_bank" );
		LIGHT_BLUE_TERRACOTTA_COIN_BANK = CoinBankBlocksFeatureLoader.registerJarCoinBankBlock( "light_blue_terracotta_coin_bank" );
		YELLOW_TERRACOTTA_COIN_BANK = CoinBankBlocksFeatureLoader.registerJarCoinBankBlock( "yellow_terracotta_coin_bank" );
		LIME_TERRACOTTA_COIN_BANK = CoinBankBlocksFeatureLoader.registerJarCoinBankBlock( "lime_terracotta_coin_bank" );
		PINK_TERRACOTTA_COIN_BANK = CoinBankBlocksFeatureLoader.registerJarCoinBankBlock( "pink_terracotta_coin_bank" );
		GRAY_TERRACOTTA_COIN_BANK = CoinBankBlocksFeatureLoader.registerJarCoinBankBlock( "gray_terracotta_coin_bank" );
		LIGHT_GRAY_TERRACOTTA_COIN_BANK = CoinBankBlocksFeatureLoader.registerJarCoinBankBlock( "light_gray_terracotta_coin_bank" );
		CYAN_TERRACOTTA_COIN_BANK = CoinBankBlocksFeatureLoader.registerJarCoinBankBlock( "cyan_terracotta_coin_bank" );
		PURPLE_TERRACOTTA_COIN_BANK = CoinBankBlocksFeatureLoader.registerJarCoinBankBlock( "purple_terracotta_coin_bank" );
		BLUE_TERRACOTTA_COIN_BANK = CoinBankBlocksFeatureLoader.registerJarCoinBankBlock( "blue_terracotta_coin_bank" );
		BROWN_TERRACOTTA_COIN_BANK = CoinBankBlocksFeatureLoader.registerJarCoinBankBlock( "brown_terracotta_coin_bank" );
		GREEN_TERRACOTTA_COIN_BANK = CoinBankBlocksFeatureLoader.registerJarCoinBankBlock( "green_terracotta_coin_bank" );
		RED_TERRACOTTA_COIN_BANK = CoinBankBlocksFeatureLoader.registerJarCoinBankBlock( "red_terracotta_coin_bank" );
		BLACK_TERRACOTTA_COIN_BANK = CoinBankBlocksFeatureLoader.registerJarCoinBankBlock( "black_terracotta_coin_bank" );
		
		COLD_PIGGY_BANK_BLOCK = CoinBankBlocksFeatureLoader.registerPiggyBankBlock( "cold_piggy_bank" );
		TEMPERATE_PIGGY_BANK_BLOCK = CoinBankBlocksFeatureLoader.registerPiggyBankBlock( "temperate_piggy_bank" );
		WARM_PIGGY_BANK_BLOCK = CoinBankBlocksFeatureLoader.registerPiggyBankBlock( "warm_piggy_bank" );
	}

}
