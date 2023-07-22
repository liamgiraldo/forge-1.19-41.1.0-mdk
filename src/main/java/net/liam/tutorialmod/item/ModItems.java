package net.liam.tutorialmod.item;

import net.liam.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> MANYULLYN = ITEMS.register("manyullyn",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB.TAB_MISC)));
    public static final RegistryObject<Item> RAW_MANYULLYN = ITEMS.register("raw_manyullyn",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB.TAB_MISC)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
