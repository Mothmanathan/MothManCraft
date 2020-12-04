package com.Moth.MothmanCraft.items;

import com.Moth.MothmanCraft.Mothmancraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(Mothmancraft.TAB));
    }
}
