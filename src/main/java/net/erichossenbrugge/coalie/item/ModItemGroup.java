package net.erichossenbrugge.coalie.item;

import net.erichossenbrugge.coalie.Coalie;
import net.erichossenbrugge.coalie.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup COALIE = FabricItemGroupBuilder.build(new Identifier(Coalie.MOD_ID, "coalie"),
            () -> new ItemStack(ModBlocks.COMPRESSED_COAL_BLOCK));
}
