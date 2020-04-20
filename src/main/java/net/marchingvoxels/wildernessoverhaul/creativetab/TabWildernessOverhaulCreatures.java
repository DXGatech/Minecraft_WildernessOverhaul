
package net.marchingvoxels.wildernessoverhaul.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;

import net.marchingvoxels.wildernessoverhaul.ElementsWildernessOverhaul;

@ElementsWildernessOverhaul.ModElement.Tag
public class TabWildernessOverhaulCreatures extends ElementsWildernessOverhaul.ModElement {
	public TabWildernessOverhaulCreatures(ElementsWildernessOverhaul instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabwildernessoverhaulcreatures") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Items.DIAMOND_SWORD, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
