package alphacentauri17.FrozenMod.common.mobs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import alphacentauri17.FrozenMod.common.mobs.RenderElsa;

@SideOnly(Side.CLIENT)
public class RenderElsa extends RenderLiving
{
private static final ResourceLocation skin = new ResourceLocation("FrozenMod:" + "textures/entities/Elsa.png");

public RenderElsa(ModelBase modelbase, float shadowSize) {
super(modelbase, shadowSize);
}

public void func_177_a(EntityElsa entityElsa, double d, double d1,
double d2, float f, float f1) {
super.doRenderLiving(entityElsa, d, d1, d2, f, f1);
}

public void doRenderLiving(EntityLivingBase entityliving, double d, double d1,
double d2, float f, float f1) {
func_177_a((EntityElsa) entityliving, d, d1, d2, f, f1);
}

        @Override
public void doRender(Entity entity, double d, double d1, double d2,
float f, float f1) {
func_177_a((EntityElsa) entity, d, d1, d2, f, f1);
}

@Override
protected ResourceLocation getEntityTexture(Entity entity) {
return skin;
}
}
