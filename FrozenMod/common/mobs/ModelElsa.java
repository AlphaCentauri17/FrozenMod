package alphacentauri17.FrozenMod.common.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelElsa extends ModelBase
{
  //fields
    ModelRenderer lower_body_2;
    ModelRenderer lower_body_1;
    ModelRenderer lower_body;
    ModelRenderer Foot_L;
    ModelRenderer Foot_R;
    ModelRenderer head;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer Upper_Body;
  
  public ModelElsa()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      lower_body_2 = new ModelRenderer(this, 44, 18);
      lower_body_2.addBox(0F, 0F, 0F, 6, 1, 4);
      lower_body_2.setRotationPoint(-3F, 6F, -2F);
      lower_body_2.setTextureSize(128, 64);
      lower_body_2.mirror = true;
      setRotation(lower_body_2, 0F, 0F, 0F);
      lower_body_1 = new ModelRenderer(this, 44, 26);
      lower_body_1.addBox(0F, 0F, 0F, 6, 1, 4);
      lower_body_1.setRotationPoint(-3F, 7F, -2F);
      lower_body_1.setTextureSize(128, 64);
      lower_body_1.mirror = true;
      setRotation(lower_body_1, 0F, 0F, 0F);
      lower_body = new ModelRenderer(this, 87, 10);
      lower_body.addBox(0F, 0F, 0F, 8, 16, 6);
      lower_body.setRotationPoint(-4F, 8F, -3F);
      lower_body.setTextureSize(128, 64);
      lower_body.mirror = true;
      setRotation(lower_body, 0F, 0F, 0F);
      Foot_L = new ModelRenderer(this, 52, 9);
      Foot_L.addBox(0F, 0F, 0F, 2, 1, 5);
      Foot_L.setRotationPoint(1F, 23F, -4F);
      Foot_L.setTextureSize(128, 64);
      Foot_L.mirror = true;
      setRotation(Foot_L, 0F, 0F, 0F);
      Foot_R = new ModelRenderer(this, 52, 1);
      Foot_R.addBox(0F, 0F, 0F, 2, 1, 5);
      Foot_R.setRotationPoint(-3F, 23F, -4F);
      Foot_R.setTextureSize(128, 64);
      Foot_R.mirror = true;
      setRotation(Foot_R, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 9, 38);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(-5F, 2F, 0F);
      rightarm.setTextureSize(128, 64);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 30, 38);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(5F, 2F, 0F);
      leftarm.setTextureSize(128, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      Upper_Body = new ModelRenderer(this, 0, 20);
      Upper_Body.addBox(0F, 0F, 0F, 8, 6, 6);
      Upper_Body.setRotationPoint(-4F, 0F, -3F);
      Upper_Body.setTextureSize(128, 64);
      Upper_Body.mirror = true;
      setRotation(Upper_Body, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    lower_body_2.render(f5);
    lower_body_1.render(f5);
    lower_body.render(f5);
    Foot_L.render(f5);
    Foot_R.render(f5);
    head.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    Upper_Body.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
    this.head.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * -1.4F * f1;
    this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.Foot_L.rotateAngleX = MathHelper.cos((float)Math.PI)*1.4F *f1; 
    this.Foot_R.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
  }

}

