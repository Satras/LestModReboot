package de.mojah.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import de.mojah.letsmodreboot.block.BlockFlag;
import de.mojah.letsmodreboot.block.BlockLMRB;
import de.mojah.letsmodreboot.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockLMRB flag = new BlockFlag();

    public static void init() {
        GameRegistry.registerBlock(flag, "flag");
    }

}
