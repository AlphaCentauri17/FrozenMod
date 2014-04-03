package alphacentauri17.FrozenMod.common.mobs;

import java.util.Random;

import alphacentauri17.FrozenMod.common.FrozenMod;
import net.minecraft.block.Block;
import net.minecraft.block.StepSound;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentThorns;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


public class EntityElsa extends EntityAnimal
{

public EntityElsa(World par1world)
{
super(par1world);

this.setSize(1.0F, 1.75F);

this.getNavigator().setAvoidsWater(true);


this.tasks.addTask(0, new EntityAISwimming(this));
this.tasks.addTask(1, new EntityAIWander(this, .5D));
this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
}
@Override
protected void applyEntityAttributes()
{
  super.applyEntityAttributes();
  // Max Health - default 20.0D - min 0.0D - max Double.MAX_VALUE
  this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(20.0D);
  // Follow Range - default 32.0D - min 0.0D - max 2048.0D
  this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(32.0D);
  // Knockback Resistance - default 0.0D - min 0.0D - max 1.0D
  this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setAttribute(0.0D);
  // Movement Speed - default 0.699D - min 0.0D - max Double.MAX_VALUE
  this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.5D);
  // Attack Damage - default 2.0D - min 0.0D - max Doubt.MAX_VALUE
}
public void onLivingUpdate()
{

super.onLivingUpdate();
int i = MathHelper.floor_double(this.posX);
int j = MathHelper.floor_double(this.posZ);
j = MathHelper.floor_double(this.posX + (double)((float)(i % 2 * 2 - 1) * 0.25F));
int k = MathHelper.floor_double(this.posY);
int m = MathHelper.floor_double(this.posY - 2F);
int n = MathHelper.floor_double(this.posY - 2F);
int l = MathHelper.floor_double(this.posZ + (double)((float)(i / 2 % 2 * 2 - 1) * 0.25F));

        if (this.worldObj.getBlockId(j, k, l) == 0 && Block.snow.canPlaceBlockAt(this.worldObj, j, k, l))
        {
            this.worldObj.setBlock(j, k, l, Block.snow.blockID);}
        
         if (this.worldObj.getBlockMaterial(i, j, m) == Material.water && worldObj.getBlockMetadata(i, j, m) == 0)
        {
            worldObj.setBlockToAir(i, j, m);}
         
         if (this.worldObj.getBlockId(j, m, l) == 0 && this.worldObj.getBiomeGenForCoords(j, l).getFloatTemperature() < .4F && Block.ice.canPlaceBlockOnSide(this.worldObj, j, m, n, l))
        {
            this.worldObj.setBlock(j, m, l, Block.ice.blockID);}
        }
public EnumCreatureAttribute getCreatureAttribute()
{
return EnumCreatureAttribute.UNDEAD;
}

protected boolean isAIEnabled()
{
return true;
}

protected boolean canDespawn()
{
return true;
}

@Override
public EntityAgeable createChild(EntityAgeable entityageable) {
// TODO Auto-generated method stub
return null;
}

}
