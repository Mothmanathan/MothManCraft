package com.Moth.MothmanCraft.items;

import com.Moth.MothmanCraft.Mothmancraft;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Moth extends Item {
    public Moth() {
        super(new Item.Properties()
                .group(Mothmancraft.TAB)
                .food(new Food.Builder()
                .hunger(2)
                .saturation(1.2F)
                .build())
        );
    }
}
