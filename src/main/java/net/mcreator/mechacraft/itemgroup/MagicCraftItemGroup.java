
package net.mcreator.mechacraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.mechacraft.block.PortalblockBlock;
import net.mcreator.mechacraft.MechacraftModElements;

@MechacraftModElements.ModElement.Tag
public class MagicCraftItemGroup extends MechacraftModElements.ModElement {
	public MagicCraftItemGroup(MechacraftModElements instance) {
		super(instance, 59);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmagic_craft") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PortalblockBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
