package com.Moth.MothmanCraft.util;

import com.Moth.MothmanCraft.Mothmancraft;
import com.Moth.MothmanCraft.armor.ModArmorMaterial;
import com.Moth.MothmanCraft.blocks.BlockItemBase;
import com.Moth.MothmanCraft.blocks.RubyBlock;
import com.Moth.MothmanCraft.blocks.RubyOre;
import com.Moth.MothmanCraft.items.ItemBase;
import com.Moth.MothmanCraft.items.Moth;
import com.Moth.MothmanCraft.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mothmancraft.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS =  DeferredRegister.create(ForgeRegistries.BLOCKS, Mothmancraft.MOD_ID);

    public static void init()   {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

//demon items are called by ruby (i.e ruby_sword = demon sword) less work changing all my starter items
    // ITEMS
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> DEEZ = ITEMS.register("deez", ItemBase::new);
    public static final RegistryObject<Moth> MOTH = ITEMS.register("moth", Moth::new);
    //Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(ModItemTier.RUBY, 3 , -2.4F, new Item.Properties().group(Mothmancraft.TAB)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new PickaxeItem(ModItemTier.RUBY, 0 , -2.8F, new Item.Properties().group(Mothmancraft.TAB)));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () ->
            new AxeItem(ModItemTier.RUBY, 2 , -2.8F, new Item.Properties().group(Mothmancraft.TAB)));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () ->
            new ShovelItem(ModItemTier.RUBY, 0 , -2.8F, new Item.Properties().group(Mothmancraft.TAB)));
    public static final RegistryObject<SwordItem> RUBY_SCYTHE = ITEMS.register("ruby_scythe", () ->
            new SwordItem(ModItemTier.RUBY,2, -2.8F, new Item.Properties().group(Mothmancraft.TAB)));

    public static final RegistryObject<SwordItem> BAT = ITEMS.register("bat", () ->
            new SwordItem(ModItemTier.BAT, 3 , -2.4F, new Item.Properties().group(Mothmancraft.TAB)));


    // Armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(Mothmancraft.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(Mothmancraft.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(Mothmancraft.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(Mothmancraft.TAB)));



    // Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);

    // Block Items
    //in the json to add new item names add , to all new registries except the last one
    public  static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block",() -> new BlockItemBase(RUBY_BLOCK.get()));
    public  static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore",() -> new BlockItemBase(RUBY_ORE.get()));
}
