package org.starminer_reborn.starminer.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.starminer_reborn.starminer.Starminer_Reborn;

public class ModItems {


    // je crois que les deux lignes du dessus initialise les items mais je suis pas sur
    // ok alors j'ai compris, la première dit dit à mc que le mod va add des items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Starminer_Reborn.MOD_ID);



    // ici en dessous on va add tous les items
    public static final RegistryObject<Item> CAMELIA = ITEMS.register("camelia", // là on crée l'item
            () -> new Item(new Item.Properties().fireResistant().tab(ModCreativeModeTab.STARMIER_TAB))); // le dernier truc on dit qu'il se place dans l'onglet créatif personnalisé



    //euh je sais pas ce que ça fait ça
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
