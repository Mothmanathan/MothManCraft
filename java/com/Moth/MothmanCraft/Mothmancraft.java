package com.Moth.MothmanCraft;

import com.Moth.MothmanCraft.init.ModBlocks;
import com.Moth.MothmanCraft.init.ModItems;
import com.Moth.MothmanCraft.init.Soundinit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("mmc")
public class Mothmancraft
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mmc";

    public Mothmancraft() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        Soundinit.SOUNDS.register((FMLJavaModLoadingContext.get().getModEventBus()));
        ModBlocks.BLOCKS.register((FMLJavaModLoadingContext.get().getModEventBus()));
        ModItems.ITEMS.register((FMLJavaModLoadingContext.get().getModEventBus()));

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    { }

    private void doClientStuff(final FMLClientSetupEvent event)
    { }
    public static final ItemGroup TAB = new ItemGroup("mmcTab"){
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.RUBY.get());
        }

    };



}
