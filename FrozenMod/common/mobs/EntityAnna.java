package alphacentauri17.FrozenMod.common.mobs;

import java.util.Random;

import alphacentauri17.FrozenMod.common.FrozenMod;
import net.minecraft.block.Block;
import net.minecraft.block.StepSound;
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


public class EntityAnna extends EntityAnimal
{

public EntityAnna(World par1world)
{
super(par1world);

this.setSize(1.0F, 1.75F);

this.getNavigator().setAvoidsWater(true);


this.tasks.addTask(0, new EntityAISwimming(this));
this.tasks.addTask(1, new EntityAIWander(this, 0.5D));
this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
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
  this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.699D);
  // Attack Damage - default 2.0D - min 0.0D - max Doubt.MAX_VALUE
}
public EnumCreatureAttribute getCreatureAttribute()
{
return EnumCreatureAttribute.UNDEFINED;
}

protected boolean isAIEnabled()
{
return true;
}

protected boolean canDespawn()
{
return false;
}

@Override
public EntityAgeable createChild(EntityAgeable entityageable) {
// TODO Auto-generated method stub
return null;
}

}