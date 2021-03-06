package alphacentauri17.FrozenMod.common; //The package your mod is in

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.SidedProxy;
import alphacentauri17.FrozenMod.common.FrozenModCommonProxy;
import alphacentauri17.FrozenMod.common.handlers.FrozenModClientPacketHandler;
import alphacentauri17.FrozenMod.common.handlers.FrozenModServerPacketHandler;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.world.biome.BiomeGenBase;
import alphacentauri17.FrozenMod.common.items.ItemDisk;
import alphacentauri17.FrozenMod.common.items.ItemElsaPower;
import alphacentauri17.FrozenMod.common.items.ItemKristoffPickaxe;
import alphacentauri17.FrozenMod.common.items.ItemOpenDoorDisk;
import alphacentauri17.FrozenMod.common.items.ItemSnowmanDisk;
import alphacentauri17.FrozenMod.common.items.ItemWandOfWinter;
import alphacentauri17.FrozenMod.common.mobs.EntityAnna;
import alphacentauri17.FrozenMod.common.mobs.EntityElsa;
import alphacentauri17.FrozenMod.common.mobs.EntityKristoff;
import alphacentauri17.FrozenMod.common.mobs.RenderKristoff;


@NetworkMod(clientSideRequired=true,serverSideRequired=true, //Whether client side and server side are needed
clientPacketHandlerSpec = @SidedPacketHandler(channels = {"FrozenMod"}, packetHandler = FrozenModClientPacketHandler.class), //For clientside packet handling
serverPacketHandlerSpec = @SidedPacketHandler(channels = {"FrozenMod"}, packetHandler = FrozenModServerPacketHandler.class)) //For serverside packet handling

//MOD BASICS
@Mod(modid="FrozenMod",name="Frozen Mod",version="0.0.2")

public class FrozenMod {

@Instance("FrozenMod") //The instance, this is very important later on
public static FrozenMod instance = new FrozenMod();

@SidedProxy(clientSide = "alphacentauri17.FrozenMod.client.FrozenModClientProxy", serverSide = "alphacentauri17.FrozenMod.common.FrozenModCommonProxy") //Tells Forge the location of your proxies
public static FrozenModCommonProxy proxy;

//ITEMS
public static Item Disk;
public static Item SnowmanDisk;
public static Item OpenDoorDisk;
public static Item KristoffPickaxe;
public static Item ElsaPower;
public static Item WandOfWinter;

@PreInit
public void PreInit(FMLPreInitializationEvent e){

//ITEMS
Disk = new ItemDisk(5700) .setUnlocalizedName("Let It Go").setCreativeTab(CreativeTabs.tabMisc);
SnowmanDisk = new ItemSnowmanDisk(5701) .setUnlocalizedName("Do You Want To Build A Snowman").setCreativeTab(CreativeTabs.tabMisc);
OpenDoorDisk = new ItemOpenDoorDisk(5702) .setUnlocalizedName("Love Is An Open Door").setCreativeTab(CreativeTabs.tabMisc);
KristoffPickaxe = new ItemKristoffPickaxe(5703, EnumToolMaterial.IRON) .setUnlocalizedName("Kristoff's Pickaxe").setCreativeTab(CreativeTabs.tabTools);
ElsaPower = new ItemElsaPower(5704) .setUnlocalizedName("Elsa's Power") .setCreativeTab(CreativeTabs.tabBrewing);
WandOfWinter = new ItemWandOfWinter(5705) .setUnlocalizedName("Wand of Winter's Power") .setCreativeTab(CreativeTabs.tabTools);
//MOBS
proxy.registerRenderInformation();

//NPCs
//Kristoff
registerEntity(EntityKristoff.class, "Kristoff", 0xeaeae9, 0xc99a03);
LanguageRegistry.instance().addStringLocalization("entity.Kristoff.name", "Kristoff");
//Elsa
registerEntity(EntityElsa.class, "Elsa", 0x00CCFF, 0x000066);
LanguageRegistry.instance().addStringLocalization("entity.Elsa.name", "Queen Elsa");
//Anna
registerEntity(EntityAnna.class, "Anna", 0xFFFFFF, 0x00CCFF);
LanguageRegistry.instance().addStringLocalization("entity.Anna.name", "Princess Anna");

}

@Init
public void InitTutorialMod(FMLInitializationEvent event){ //Your main initialization method

//ITEMS (Method)
proxy.registerItems();

//MULTIPLAYER ABILITY
NetworkRegistry.instance().registerGuiHandler(this, proxy); //Registers the class that deals with GUI data

}

public void registerEntity(Class<? extends Entity> entityClass, String entityName, int bkEggColor, int fgEggColor) {
int id = EntityRegistry.findGlobalUniqueEntityId();

EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
EntityList.entityEggs.put(Integer.valueOf(id), new EntityEggInfo(id, bkEggColor, fgEggColor));
}

public void addSpawn(Class<? extends EntityLiving> entityClass, int spawnProb, int min, int max, BiomeGenBase[] biomes) {
if (spawnProb > 0) {
EntityRegistry.addSpawn(entityClass, spawnProb, min, max, EnumCreatureType.creature, biomes);
}
}
}