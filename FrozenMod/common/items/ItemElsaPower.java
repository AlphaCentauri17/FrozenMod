package alphacentauri17.FrozenMod.common.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemElsaPower extends ItemFood
{
	private int[] potionEffect = {9, 18, 13};
	private int[] potionDuration = {60, 30, 60};
	private int[] potionTier = {3, 2, 2};
	
    public ItemElsaPower(int itemID)
	{
    	super(itemID, 0, 0F, false);
	    this.maxStackSize = 64;
	    this.setAlwaysEdible();	        
	}
    
    @Override 
    public void registerIcons(IconRegister iconRegister)
    {
    	itemIcon = iconRegister.registerIcon("FrozenMod:" + "ElsaPower");
    }
    public void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player)
    {	
        --itemstack.stackSize;
        player.getFoodStats().addStats(this);
        world.playSoundAtEntity(player, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
        this.addPotionEffects(itemstack, world, player);   		        
    }
    
    protected void addPotionEffects(ItemStack item, World world, EntityPlayer player)
    {
        player.addPotionEffect(new PotionEffect(potionEffect[0], potionDuration[0] * 20, potionTier[0]));       
        player.addPotionEffect(new PotionEffect(potionEffect[1], potionDuration[1] * 20, potionTier[1])); 
        player.addPotionEffect(new PotionEffect(potionEffect[2], potionDuration[2] * 20, potionTier[2])); 
    }
    
    public EnumAction getItemUseAction(ItemStack itemstack)
    {
        return EnumAction.drink;       
    }
    
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
    {     	
    	player.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));	       	
        return itemstack; 
    }
    
    public boolean hasEffect(ItemStack itemstack)
    {	
        return true;        
    }
    
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean par4)
    {
    	list.add("I would not drink this...");    	
    }	
}
