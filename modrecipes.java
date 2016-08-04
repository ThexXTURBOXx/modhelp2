package nethermod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class modrecipes

{

    public static void init() {
        GameRegistry.addRecipe(new ItemStack(Items.NETHER_STAR), "nqs", "qeq", "sqn", 'n', Blocks.NETHERRACK,'s', Blocks.SOUL_SAND,'e', Blocks.EMERALD_BLOCK,'q', Items.QUARTZ);
        GameRegistry.addRecipe(new ItemStack(Blocks.LOG), "DD","DD","",'D', new ItemStack(Blocks.DIRT,4));
        GameRegistry.addRecipe(new ItemStack(Blocks.STONE), "ll","ll","",'l', new ItemStack(Blocks.LOG,4));
        GameRegistry.addRecipe(new ItemStack(Blocks.IRON_BLOCK), "ss","ss","",'s', new ItemStack(Blocks.STONEBRICK,4));
        GameRegistry.addRecipe(new ItemStack(Blocks.GOLD_BLOCK), "ii","ii","",'i', new ItemStack(Blocks.IRON_BLOCK,4));
        GameRegistry.addRecipe(new ItemStack(Blocks.DIAMOND_BLOCK), "gg","gg","",'g', new ItemStack(Blocks.GOLD_BLOCK,4));
        GameRegistry.addRecipe(new ItemStack(Blocks.EMERALD_BLOCK), "dd ","dd",'d',new ItemStack(Blocks.DIAMOND_BLOCK,4));
        GameRegistry.addRecipe(new ItemStack(Blocks.COAL_BLOCK), "cc","cc","",'c', new ItemStack(Blocks.COBBLESTONE));
    }
}
