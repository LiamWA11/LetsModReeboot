package com.liamwa11.letsmodreboot;

import com.liamwa11.letsmodreboot.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = "LetsModReboot",
        name = "Lets Mod Reboot",
        version = "1.7.2-1.0"
)
public class LetsModReboot
{
    @Mod.Instance("LetsModReboot")
    public static LetsModReboot instance;

    @SidedProxy(clientSide = "com.liamwa11.letsmodreboot.proxy.ClientProxy", serverSide = "com.liamwa11.letsmodreboot.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void Init(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
