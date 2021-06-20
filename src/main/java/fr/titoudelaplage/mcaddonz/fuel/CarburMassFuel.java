
package fr.titoudelaplage.mcaddonz.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import fr.titoudelaplage.mcaddonz.item.PlombItem;
import fr.titoudelaplage.mcaddonz.McAddonzModElements;

@McAddonzModElements.ModElement.Tag
public class CarburMassFuel extends McAddonzModElements.ModElement {
	public CarburMassFuel(McAddonzModElements instance) {
		super(instance, 1);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(PlombItem.block, (int) (1)).getItem())
			event.setBurnTime(1600);
	}
}
