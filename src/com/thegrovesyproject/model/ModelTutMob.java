package com.thegrovesyproject.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelTutMob extends ModelBase
{
  //fields
    ModelRenderer body;
    ModelRenderer foot1;
    ModelRenderer foot2;
  
  public ModelTutMob()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      body = new ModelRenderer(this, 0, 0);
      body.addBox(-2F, 0F, -2F, 5, 5, 4);
      body.setRotationPoint(0F, 16F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      foot1 = new ModelRenderer(this, 0, 12);
      foot1.addBox(-1F, 0F, -1F, 2, 3, 2);
      foot1.setRotationPoint(-1F, 21F, 0F);
      foot1.setTextureSize(64, 32);
      foot1.mirror = true;
      setRotation(foot1, 0F, 0F, 0F);
      foot2 = new ModelRenderer(this, 13, 12);
      foot2.addBox(-1F, 0F, -1F, 2, 3, 2);
      foot2.setRotationPoint(2F, 21F, 0F);
      foot2.setTextureSize(64, 32);
      foot2.mirror = true;
      setRotation(foot2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    body.render(f5);
    foot1.render(f5);
    foot2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float f6 = (180F / (float)Math.PI);
    this.body.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.body.rotateAngleY = f3 / (180F / (float)Math.PI);

    this.foot1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.foot2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
  }

}
