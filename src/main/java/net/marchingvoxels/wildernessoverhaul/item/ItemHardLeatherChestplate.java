
package net.marchingvoxels.wildernessoverhaul.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.marchingvoxels.wildernessoverhaul.ElementsWildernessOverhaul;

@ElementsWildernessOverhaul.ModElement.Tag
public class ItemHardLeatherChestplate extends ElementsWildernessOverhaul.ModElement {
	@GameRegistry.ObjectHolder("wildernessoverhaul:hardleatherchestplatehelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("wildernessoverhaul:hardleatherchestplatebody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("wildernessoverhaul:hardleatherchestplatelegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("wildernessoverhaul:hardleatherchestplateboots")
	public static final Item boots = null;
	public ItemHardLeatherChestplate(ElementsWildernessOverhaul instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("HARDLEATHERCHESTPLATE", "wildernessoverhaul:hardlea_", 10, new int[]{2, 5, 6, 2},
				9, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.anvil.step")), 0.8f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("hardleatherchestplatehelmet")
				.setRegistryName("hardleatherchestplatehelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("hardleatherchestplatebody")
				.setRegistryName("hardleatherchestplatebody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("hardleatherchestplatelegs")
				.setRegistryName("hardleatherchestplatelegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("hardleatherchestplateboots")
				.setRegistryName("hardleatherchestplateboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0,
				new ModelResourceLocation("wildernessoverhaul:hardleatherchestplatehelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("wildernessoverhaul:hardleatherchestplatebody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("wildernessoverhaul:hardleatherchestplatelegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("wildernessoverhaul:hardleatherchestplateboots", "inventory"));
	}
}
