package net.HyveMoarte.test;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Test.MOD_ID, name = Test.MOD_NAME, version = Test.VERSION, dependencies = Test.DEPENDENCIES)

public class Test {

	
	//CONSTANTS
	public static final String MOD_ID 			= "test_mod";
	public static final String MOD_NAME 		= "My second test mod";
	public static final String VERSION 			= "@VERSION@";
	public static final String DEPENDENCIES 	= "required-after:forge@[14.23.1.2555,)";
	public static final String RESOURCE_PREFIX 	= MOD_ID.toLowerCase() + ":";
	
	
	//VARIABLES
	public static Random random = new Random();
	
	@Instance(MOD_ID)
	public static Test instance;
	
	@SidedProxy(clientSide = "net.HyveMoarte.test.ClientProxy", serverSide = "net.HyveMoarte.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
