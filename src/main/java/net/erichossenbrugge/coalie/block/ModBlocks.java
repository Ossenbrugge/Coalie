package net.erichossenbrugge.coalie.block;

import net.erichossenbrugge.coalie.Coalie;
import net.erichossenbrugge.coalie.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ModBlocks {

    public static final Block COMPRESSED_COAL_BLOCK = registerBlock("compressed_coal_block",
            new Block(FabricBlockSettings.of(Material.AGGREGATE)), ModItemGroup.COALIE,
            "tooltip.coalie.compressed_coal_block");

    public static final Block DOUBLE_COMPRESSED_COAL_BLOCK = registerBlock("double_compressed_coal_block",
            new Block(FabricBlockSettings.of(Material.AGGREGATE)), ModItemGroup.COALIE,
            "tooltip.coalie.double_compressed_coal_block");
    public static final Block TRIPLE_COMPRESSED_COAL_BLOCK = registerBlock("triple_compressed_coal_block",
            new Block(FabricBlockSettings.of(Material.AGGREGATE)), ModItemGroup.COALIE,
            "tooltip.coalie.triple_compressed_coal_block");
    public static final Block QUADRUPLE_COMPRESSED_COAL_BLOCK = registerBlock("quadruple_compressed_coal_block",
            new Block(FabricBlockSettings.of(Material.AGGREGATE)), ModItemGroup.COALIE,
            "tooltip.coalie.quadruple_compressed_coal_block");

    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey){
        registerBlockItem(name, block, group, tooltipKey);
        return Registry.register(Registry.BLOCK, new Identifier(Coalie.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey){
        return Registry.register(Registry.ITEM, new Identifier(Coalie.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)){
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context){
                        tooltip.add(Text.translatable(tooltipKey));
                    }
                });
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Coalie.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(Coalie.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks (){
        Coalie.LOGGER.info("Registering ModBlocks for " + Coalie.MOD_ID);
    }


}
