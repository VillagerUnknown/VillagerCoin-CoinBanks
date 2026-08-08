package me.villagerunknown.coinbanks.feature;

import me.villagerunknown.coinbanks.block.*;
import me.villagerunknown.villagercoin.Villagercoin;
import me.villagerunknown.villagercoin.block.CoinBankBlock;
import me.villagerunknown.villagercoin.feature.CoinBankBlocksFeature;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static me.villagerunknown.villagercoin.Villagercoin.MOD_ID;

public class CoinBankBlocksRegistrationFeature {

	public static void execute(){
		new CoinBankBlocks();
	}
	
	public static Block registerCoinBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( MOD_ID, id, new CoinBankBlock( BlockBehaviour.Properties.of().instabreak().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,id))) ) );
	}
	
	public static Block registerFireproofCoinBankBlock( String id ) {
		return CoinBankBlocksFeature.registerFireproofCoinBankBlock( MOD_ID, id, new CoinBankBlock( BlockBehaviour.Properties.of().instabreak().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,id))) ) );
	}
	
	public static Block registerJarCoinBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( MOD_ID, id, new JarCoinBankBlock( BlockBehaviour.Properties.of().instabreak().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,id))) ) );
	}
	
	public static Block registerToughJarCoinBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( MOD_ID, id, new ToughJarCoinBankBlock( BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,id))) ) );
	}
	
	public static Block registerToughFireproofJarCoinBankBlock( String id ) {
		return CoinBankBlocksFeature.registerFireproofCoinBankBlock( MOD_ID, id, new ToughJarCoinBankBlock( BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,id))) ) );
	}
	
	public static Block registerCubeBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( MOD_ID, id, new CubeBankBlock( BlockBehaviour.Properties.of().instabreak().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,id))) ) );
	}
	
	public static Block registerPiggyBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( MOD_ID, id, new PiggyBankBlock( BlockBehaviour.Properties.of().instabreak().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,id))) ) );
	}
	
	public static Block registerSheepBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( MOD_ID, id, new SheepBankBlock( BlockBehaviour.Properties.of().instabreak().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,id))) ) );
	}
	
	public static Block registerCowBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( MOD_ID, id, new CowBankBlock( BlockBehaviour.Properties.of().instabreak().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,id))) ) );
	}
	
	public static Block registerBeeBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( MOD_ID, id, new BeeBankBlock( BlockBehaviour.Properties.of().instabreak().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,id))) ) );
	}
	
	public static Block registerRavagerBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( MOD_ID, id, new RavagerBankBlock( BlockBehaviour.Properties.of().instabreak().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,id))) ) );
	}
	
	public static Block registerGuardianBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( MOD_ID, id, new GuardianBankBlock( BlockBehaviour.Properties.of().instabreak().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,id))) ) );
	}
	
	public static Block registerHoglinBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( MOD_ID, id, new HoglinBankBlock( BlockBehaviour.Properties.of().instabreak().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,id))) ) );
	}
	
	public static Block registerZoglinBankBlock( String id ) {
		return CoinBankBlocksFeature.registerCoinBankBlock( MOD_ID, id, new ZoglinBankBlock( BlockBehaviour.Properties.of().instabreak().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,id))) ) );
	}
	
}
