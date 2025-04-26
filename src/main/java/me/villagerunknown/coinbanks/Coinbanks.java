package me.villagerunknown.coinbanks;

import me.villagerunknown.coinbanks.feature.CoinBankBlocksFeatureLoader;
import me.villagerunknown.platform.Platform;
import me.villagerunknown.platform.PlatformMod;
import me.villagerunknown.platform.manager.featureManager;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class Coinbanks implements ModInitializer {
	
	public static PlatformMod<CoinbanksConfigData> MOD = Platform.register("coinbanks", Coinbanks.class, CoinbanksConfigData.class );
	public static String MOD_ID = MOD.getModId();
	public static Logger LOGGER = MOD.getLogger();
	public static CoinbanksConfigData CONFIG = MOD.getConfig();
	
	@Override
	public void onInitialize() {
		// # Initialize Mod
		init();
	}
	
	private static void init() {
		Platform.init_mod( MOD );
		
		// # Activate Features
		featureManager.addFeature( "CoinBankBlocksFeature", CoinBankBlocksFeatureLoader::execute );
	}
	
}
