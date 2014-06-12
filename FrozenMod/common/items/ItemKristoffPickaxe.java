package alphacentauri17.FrozenMod.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import alphacentauri17.FrozenMod.common.FrozenMod;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.client.renderer.texture.IconRegister;

public class ItemKristoffPickaxe extends ItemPickaxe
{
public ItemKristoffPickaxe(int par1, EnumToolMaterial par2EnumToolMaterial)
{
super(par1, par2EnumToolMaterial);
}
@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister iconRegister)
{
itemIcon = iconRegister.registerIcon("FrozenMod:" + "KristoffPickaxe");
}
}