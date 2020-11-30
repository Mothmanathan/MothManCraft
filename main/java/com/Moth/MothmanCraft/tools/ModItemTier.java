package com.Moth.MothmanCraft.tools;

import com.Moth.MothmanCraft.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {


    RUBY(3,900,7.0F,3.0F,10, () -> {
        return Ingredient.fromItems(RegistryHandler.RUBY.get());
    }),

    BAT(0,900,7.0F,2.0F,10, () -> {
        return Ingredient.fromItems(RegistryHandler.BAT.get());
    }),

    GREATSWORD(0,900,7.0F,4.0F,1, () -> {
        return Ingredient.fromItems(RegistryHandler.GREATSWORD.get());
    })

    ;

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }


    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
