package org.justin.condiment.thecondimentmod.item;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;


public abstract class ModArmor extends ArmorItem{

    public ModArmor(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties);
    }

}
