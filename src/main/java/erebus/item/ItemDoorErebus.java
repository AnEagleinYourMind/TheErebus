package erebus.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import erebus.ModTabs;
import erebus.block.BlockDoorErebus;

public class ItemDoorErebus extends Item {

    private final BlockDoorErebus door;

    public ItemDoorErebus(Block door) {
        this.door = (BlockDoorErebus) door;
        setMaxStackSize(64);
        setCreativeTab(ModTabs.blocks);

        String name = ((BlockDoorErebus) door).name;
        setTextureName("erebus:door_" + name);
        setUnlocalizedName("erebus.door_" + name);

        this.door.setItem(this);
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return StatCollector.translateToLocal("tile.erebus.door" + door.name + ".name");
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side,
        float hitX, float hitY, float hitZ) {
        if (side != 1) return false;
        else {
            y++;
            if (player.canPlayerEdit(x, y, z, side, stack) && player.canPlayerEdit(x, y + 1, z, side, stack)) {
                if (!door.canPlaceBlockAt(world, x, y, z)) return false;
                else {
                    ItemDoor.placeDoorBlock(
                        world,
                        x,
                        y,
                        z,
                        MathHelper.floor_double((player.rotationYaw + 180.0F) * 4.0F / 360.0F - 0.5D) & 3,
                        door);
                    stack.stackSize--;
                    return true;
                }
            } else return false;
        }
    }
}
