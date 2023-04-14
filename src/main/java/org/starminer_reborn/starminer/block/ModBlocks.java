package org.starminer_reborn.starminer.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.starminer_reborn.starminer.Starminer_Reborn;
import org.starminer_reborn.starminer.item.ModCreativeModeTab;
import org.starminer_reborn.starminer.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    //ça ça dit a mc qu'on va foutre des blocks
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Starminer_Reborn.MOD_ID);


    //en dessous on crée les bloques
    public static final RegistryObject<Block> CAMELIA_FLOWER = registerBlock("camelia_flower",
            () -> new Block(BlockBehaviour.Properties.of(Material.PLANT).instabreak()), ModCreativeModeTab.STARMIER_TAB);
    public static final RegistryObject<Block> ROSE_FLOWER = registerBlock("rose_flower",
            () -> new Block(BlockBehaviour.Properties.of(Material.PLANT).instabreak()), ModCreativeModeTab.STARMIER_TAB);



    //j'ai aucune putain d'idée de ce qu'est le truc en dessous

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) { //WTF IS THIS FUCKING SHIT DOING
        RegistryObject<T> toReturn = BLOCKS.register(name, block);//bruh
        registryBlockItem(name, toReturn, tab); //je call le truc en dessous je crois
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab))); //quesque je suis entrain de faire putain
    }


    //ça permet de register
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
