package me.villagerunknown.coinbanks;

import me.villagerunknown.coinbanks.feature.CoinBankBlocksFeatureLoader;
import me.villagerunknown.platform.Platform;
import me.villagerunknown.platform.PlatformMod;
import me.villagerunknown.platform.manager.featureManager;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class Coinbanks implements ModInitializer {
	
	public static PlatformMod<?> MOD = Platform.register("coinbanks", Coinbanks.class );
	public static String MOD_ID = MOD.getModId();
	public static Logger LOGGER = MOD.getLogger();
	
	@Override
	public void onInitialize() {
		// # Initialize Mod
		init();
	}
	
	private static void init() {
		Platform.init_mod( MOD );
		
		// # Activate Features
		featureManager.addFeature( "coinBankBlocksFeatureLoader", CoinBankBlocksFeatureLoader::execute );
		
		// # Load Features
		featureManager.loadFeatures();
	}
	
}
