package com.Moth.MothmanCraft.init;

import com.Moth.MothmanCraft.Mothmancraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class Soundinit  {

    public static final DeferredRegister<SoundEvent> SOUNDS =  DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Mothmancraft.MOD_ID);


    public static final RegistryObject<SoundEvent> BAT_SOUND = SOUNDS.register
            ("item.bat_sound", () -> new SoundEvent(new ResourceLocation(Mothmancraft.MOD_ID, "item.bat_sound")));




}
