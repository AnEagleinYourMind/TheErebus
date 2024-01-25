package erebus.preserved;

import net.minecraft.entity.Entity;

import erebus.api.IPreservableEntityHandler;
import erebus.entity.EntityWasp;
import erebus.preserved.PreservableEntityRegistry.EntityDimensions;

public class PreservedWaspHandler implements IPreservableEntityHandler {

    private final EntityDimensions normal = new EntityDimensions(0.0F, 0.35F, 0.0F, 0.35F);
    private final EntityDimensions boss = new EntityDimensions(0.0F, 0.35F, 0.0F, 0.35F / 2F);

    @Override
    public boolean handlesEntity(Entity entity) {
        return entity instanceof EntityWasp;
    }

    @Override
    public boolean canbePreserved(Entity entity) {
        return true;
    }

    @Override
    public EntityDimensions getDimensions(Entity entity) {
        return ((EntityWasp) entity).getIsBoss() == 1 ? boss : normal;
    }
}
