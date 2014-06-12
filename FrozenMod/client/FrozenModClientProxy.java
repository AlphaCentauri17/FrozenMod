package alphacentauri17.FrozenMod.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import alphacentauri17.FrozenMod.common.FrozenModCommonProxy;
import alphacentauri17.FrozenMod.common.mobs.EntityAnna;
import alphacentauri17.FrozenMod.common.mobs.EntityElsa;
import alphacentauri17.FrozenMod.common.mobs.EntityKristoff;
import alphacentauri17.FrozenMod.common.mobs.RenderAnna;
import alphacentauri17.FrozenMod.common.mobs.RenderKristoff;
import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.client.MinecraftForgeClient;
import alphacentauri17.FrozenMod.common.mobs.RenderElsa;
import alphacentauri17.FrozenMod.common.mobs.ModelElsa;

public class FrozenModClientProxy extends FrozenModCommonProxy {

public void registerRenderInformation(){
float shadowSize = 0.5F;

//MOBS
RenderingRegistry.registerEntityRenderingHandler(EntityKristoff.class, new RenderKristoff(new ModelBiped(), shadowSize));

RenderingRegistry.registerEntityRenderingHandler(EntityElsa.class, new RenderElsa(new ModelElsa(), shadowSize));

RenderingRegistry.registerEntityRenderingHandler(EntityAnna.class, new RenderAnna(new ModelElsa(), shadowSize));}

public void registerRenderers(){

}
}