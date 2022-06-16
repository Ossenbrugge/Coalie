package net.erichossenbrugge.coalie.item;

import net.erichossenbrugge.coalie.Coalie;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Coalie.MOD_ID, name), item);
    }
    public static void registerModItems(){
        Coalie.LOGGER.info("Registering Mod Items for " + Coalie.MOD_ID);
    }

}
