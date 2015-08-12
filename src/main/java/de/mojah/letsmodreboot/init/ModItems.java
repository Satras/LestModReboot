package de.mojah.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import de.mojah.letsmodreboot.item.ItemLMRB;
import de.mojah.letsmodreboot.item.ItemMapleLeaf;
import de.mojah.letsmodreboot.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init() {

        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");

    }

}
