package me.villagerunknown.coinbanks;

import me.villagerunknown.coinbanks.feature.CoinBankBlocksRegistrationFeature;
import me.villagerunknown.platform.Platform;
import me.villagerunknown.platform.PlatformMod;
import me.villagerunknown.platform.manager.featureManager;
import me.villagerunknown.villagercoin.Villagercoin;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class Coinbanks implements ModInitializer {
	
	public static PlatformMod<?> MOD = Platform.register("coinbanks", Coinbanks.class );
	public static String MOD_ID = MOD.getModId();
	public static Logger LOGGER = MOD.getLogger();
	
	@Override
	public void onInitialize() {
		// # Load Villager Coin
		Villagercoin.load();
		
		// # Initialize addon mod with Platform
		Platform.init_mod( MOD );
		
		// # Activate Features
		featureManager.addFeature( "coin-bank-blocks-registration", CoinBankBlocksRegistrationFeature::execute );
		
		// # Load Features
		featureManager.loadFeatures();
	}
	
}
