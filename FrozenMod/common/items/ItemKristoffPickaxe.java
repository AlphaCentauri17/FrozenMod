package alphacentauri17.FrozenMod.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import alphacentauri17.FrozenMod.common.FrozenMod;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
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
import net.minecraftforge.common.IShearable;

public class ItemKristoffPickaxe extends ItemPickaxe
{
public ItemKristoffPickaxe(int par1, EnumToolMaterial par2EnumToolMaterial)
{
super(par1, par2EnumToolMaterial);
}
public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLivingBase par7EntityLivingBase)
{
    if (par3 != Block.ice.blockID && par3 != Block.stone.blockID && par3 != Block.oreCoal.blockID && par3 != Block.oreIron.blockID && par3 != Block.oreGold.blockID && par3 != Block.oreDiamond.blockID)
    {
        return super.onBlockDestroyed(par1ItemStack, par2World, par3, par4, par5, par6, par7EntityLivingBase);
    }
    else
    {
        return true;
    }
}

/**
 * Returns if the item (tool) can harvest results from the block type.
 */
public boolean canHarvestBlock(Block par1Block)
{
    return par1Block.blockID == Block.ice.blockID || par1Block.blockID == Block.stone.blockID || par1Block.blockID == Block.oreCoal.blockID || par1Block.blockID == Block.oreIron.blockID || par1Block.blockID == Block.oreGold.blockID || par1Block.blockID == Block.oreDiamond.blockID;
}

/**
 * Returns the strength of the stack against a given block. 1.0F base, (Quality+1)*2 if correct blocktype, 1.5F if
 * sword
 */
public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
{
    return par2Block.blockID != Block.ice.blockID && par2Block.blockID != Block.stone.blockID ? (par2Block.blockID == Block.ice.blockID ? 5.0F : super.getStrVsBlock(par1ItemStack, par2Block)) : 15.0F;
}
@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister iconRegister)
{
itemIcon = iconRegister.registerIcon("FrozenMod:" + "KristoffPickaxe");
}
}