package erebus.item.bambucket;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import erebus.ModItems;

public class BambucketAntiVenom extends BambucketDrinkable {

	public BambucketAntiVenom() {
		super("erebus:bambucketAntivenom");
		setUnlocalizedName("bambucketAntiVenom");
		setTextureName("erebus:bambucketAntivenom");
	}

	@Override
	@SuppressWarnings("unchecked")
	public ItemStack applyEffects(ItemStack stack, World world, EntityPlayer player) {
		List<Potion> toRemove = new ArrayList<Potion>();
		for (PotionEffect effect : (Collection<PotionEffect>) player.getActivePotionEffects()) {
			Potion potion = Potion.potionTypes[effect.getPotionID()];
			if (potion.isBadEffect())
				toRemove.add(potion);
		}
		for (Potion potion : toRemove)
			player.removePotionEffect(potion.getId());

		if (!player.capabilities.isCreativeMode) {
			stack.stackSize--;
			player.inventory.addItemStackToInventory(new ItemStack(ModItems.bambucket));
		}
		return stack;
	}
}