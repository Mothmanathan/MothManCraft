package com.Moth.MothmanCraft.init;

import com.Moth.MothmanCraft.Mothmancraft;
import com.Moth.MothmanCraft.blocks.BlockItemBase;
import com.Moth.MothmanCraft.items.ItemBase;
import com.Moth.MothmanCraft.items.Moth;
import com.Moth.MothmanCraft.util.enums.ModArmorMaterial;
import com.Moth.MothmanCraft.util.enums.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mothmancraft.MOD_ID);
    //items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> DEEZ = ITEMS.register("deez", ItemBase::new);
    public static final RegistryObject<Moth> MOTH = ITEMS.register("moth", Moth::new);
    public static final RegistryObject<Item> GREATSWORD_HILT = ITEMS.register("greatsword_hilt", ItemBase::new);
    public static final RegistryObject<Item> GREATSWORD_BLADE = ITEMS.register("greatsword_blade", ItemBase::new);
    public static final RegistryObject<Item> CORRUPTED_BLAZE_ROD = ITEMS.register("corrupted_blaze_rod", ItemBase::new);
    public static final RegistryObject<Item> BLACK_BLOOD = ITEMS.register("black_blood", ItemBase::new);

    public  static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block",() -> new BlockItemBase(ModBlocks.RUBY_BLOCK.get()));
    public  static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore",() -> new BlockItemBase(ModBlocks.RUBY_ORE.get()));

    public static final RegistryObject<Item> CONCORD = ITEMS.register("concord_gem", ItemBase::new);
    public  static final RegistryObject<Item> CONCORD_ORE = ITEMS.register("concord_ore",() -> new BlockItemBase(ModBlocks.CONCORD_ORE.get()));

    //demon items are called by ruby (i.e ruby_sword = demon sword) less work changing all my starter items
    //Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(ModItemTier.RUBY, 4 , -2.4F, new Item.Properties().group(Mothmancraft.TAB)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new PickaxeItem(ModItemTier.RUBY, 0 , -2.8F, new Item.Properties().group(Mothmancraft.TAB)));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () ->
            new AxeItem(ModItemTier.RUBY, 2 , -2.8F, new Item.Properties().group(Mothmancraft.TAB)));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () ->
            new ShovelItem(ModItemTier.RUBY, 0 , -2.8F, new Item.Properties().group(Mothmancraft.TAB)));
    public static final RegistryObject<SwordItem> RUBY_SCYTHE = ITEMS.register("ruby_scythe", () ->
            new SwordItem(ModItemTier.RUBY,2, -2.8F, new Item.Properties().group(Mothmancraft.TAB)));

    public static final RegistryObject<SwordItem> CONCORD_SWORD = ITEMS.register("concord_sword", () ->
            new SwordItem(ModItemTier.CONCORD, 4 , -2.4F, new Item.Properties().group(Mothmancraft.TAB)));
    public static final RegistryObject<PickaxeItem> CONCORD_PICKAXE = ITEMS.register("concord_pickaxe", () ->
            new PickaxeItem(ModItemTier.CONCORD, 0 , -2.8F, new Item.Properties().group(Mothmancraft.TAB)));
    public static final RegistryObject<AxeItem> CONCORD_AXE = ITEMS.register("concord_axe", () ->
            new AxeItem(ModItemTier.CONCORD, 2 , -2.8F, new Item.Properties().group(Mothmancraft.TAB)));
    public static final RegistryObject<ShovelItem> CONCORD_SHOVEL = ITEMS.register("concord_shovel", () ->
            new ShovelItem(ModItemTier.CONCORD, 0 , -2.8F, new Item.Properties().group(Mothmancraft.TAB)));
    public static final RegistryObject<HoeItem> CONCORD_HOE = ITEMS.register("concord_hoe", () ->
            new HoeItem(ModItemTier.CONCORD,-3,2.0F, new Item.Properties().group(Mothmancraft.TAB)));
    // dmg, attack speed
    public static final RegistryObject<SwordItem> BAT = ITEMS.register("bat", () ->
            new SwordItem(ModItemTier.BAT, 3 , -2.4F, new Item.Properties().group(Mothmancraft.TAB)));




    public static final RegistryObject<SwordItem> GREATSWORD = ITEMS.register("greatsword", () ->
            new SwordItem(ModItemTier.GREATSWORD, 3 , -2.9F, new Item.Properties().group(Mothmancraft.TAB)));




    // Armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(Mothmancraft.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(Mothmancraft.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(Mothmancraft.TAB)));

    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () ->
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(Mothmancraft.TAB)));

}
