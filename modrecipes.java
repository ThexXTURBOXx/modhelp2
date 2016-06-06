package nethermod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class modrecipes

{

    {
        GameRegistry.addRecipe(new ItemStack(Items.NETHER_STAR),new Object[]{ "nqs", "qeq", "sqn", 'n', Blocks.NETHERRACK,'s', Blocks.SOUL_SAND,'e', Blocks.EMERALD_BLOCK,'q', Items.QUARTZ});
        GameRegistry.addRecipe(new ItemStack(Blocks.LOG),new Object[]{"DD","DD","",'D', new ItemStack(Blocks.DIRT,4)});
        GameRegistry.addRecipe(new ItemStack(Blocks.STONE), new Object[]{"ll","ll","",'l', new ItemStack(Blocks.LOG,4)});
        GameRegistry.addRecipe(new ItemStack(Blocks.IRON_BLOCK), new Object[]{"ss","ss","",'s', new ItemStack(Blocks.STONEBRICK,4)});
        GameRegistry.addRecipe(new ItemStack(Blocks.GOLD_BLOCK), new Object[]{ "ii","ii","",'i', new ItemStack(Blocks.IRON_BLOCK,4)});
        GameRegistry.addRecipe(new ItemStack(Blocks.DIAMOND_BLOCK), new Object[]{"gg","gg","",'g', new ItemStack(Blocks.GOLD_BLOCK,4)});
        GameRegistry.addRecipe(new ItemStack(Blocks.EMERALD_BLOCK), new Object[]{ "dd ","dd",'d',new ItemStack(Blocks.DIAMOND_BLOCK,4)});
        GameRegistry.addRecipe(new ItemStack(Blocks.COAL_BLOCK), new Object[]{"cc","cc","",'c', new ItemStack(Blocks.COBBLESTONE)});
    }

    public static void init() {
    }
}
