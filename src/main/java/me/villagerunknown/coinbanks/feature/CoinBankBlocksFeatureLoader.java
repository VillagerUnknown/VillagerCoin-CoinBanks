package me.villagerunknown.coinbanks.feature;

import me.villagerunknown.coinbanks.block.*;
import me.villagerunknown.villagercoin.block.CoinBankBlock;
import me.villagerunknown.villagercoin.feature.CoinBankBlocksFeature;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;

public class CoinBankBlocksFeatureLoader {

	public static void execute(){
		new CoinBankBlocks();
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
