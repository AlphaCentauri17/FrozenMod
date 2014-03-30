package alphacentauri17.FrozenMod.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import alphacentauri17.FrozenMod.common.FrozenModCommonProxy;
import alphacentauri17.FrozenMod.common.mobs.EntityKristoff;
import alphacentauri17.FrozenMod.common.mobs.RenderKristoff;
import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.client.MinecraftForgeClient;

public class FrozenModClientProxy extends FrozenModCommonProxy {

public void registerRenderInformation(){

}

public void registerRenderers(){
float shadowSize = 0.5F;

//MOBS
RenderingRegistry.registerEntityRenderingHandler(EntityKristoff.class, new RenderKristoff(new ModelBiped(), shadowSize));

}

}