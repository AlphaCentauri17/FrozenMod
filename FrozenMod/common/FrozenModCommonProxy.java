package alphacentauri17.FrozenMod.common;

import alphacentauri17.SipscoMod.common.SipscoMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class FrozenModCommonProxy implements IGuiHandler{ //THIS IS IMPORTANT, CANNOT BE A PROXY/GUI HANDLER WITHOUT THIS!!
public void registerRenderInformation() //Client side texture registering
{
}
@Override
public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) { //For GUI's
return null;
}
@Override
public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) { //For GUI's
return null;
}

public void registerTiles(){ //For registering TileEntities
}

public void registerBlocks(){ //For registering Blocks
}

public void registerItems(){ //For registering Items
//Disk
LanguageRegistry.addName (FrozenMod.Disk, "Let It Go");
//SnowmanDisk
LanguageRegistry.addName (FrozenMod.SnowmanDisk, "Do You Want To Build A Snowman");
//OpenDoorDisk
LanguageRegistry.addName (FrozenMod.OpenDoorDisk,  "Love Is An Open Door");
//KristoffPickaxe
LanguageRegistry.addName(FrozenMod.KristoffPickaxe, "Kristoff's Pickaxe");
GameRegistry.addRecipe(new ItemStack(FrozenMod.KristoffPickaxe), "MNM"," N "," N ", Character.valueOf('M'), Item.ingotIron, Character.valueOf('N'), Item.stick);
//ElsaPower
LanguageRegistry.addName(FrozenMod.ElsaPower, "Elsa's Power");
//WandOfWinter
LanguageRegistry.addName(FrozenMod.WandOfWinter, "Wand of Winter's Power");
GameRegistry.addRecipe(new ItemStack(FrozenMod.WandOfWinter), " Y "," X "," Z ", Character.valueOf('Y'), FrozenMod.ElsaPower, Character.valueOf('X'), Item.diamond, Character.valueOf('Z'), Item.stick);
}
}