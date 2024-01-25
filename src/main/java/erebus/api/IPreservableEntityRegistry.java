package erebus.api;

import net.minecraft.entity.Entity;

import erebus.preserved.PreservableEntityRegistry.EntityDimensions;

public interface IPreservableEntityRegistry {

    void registerHandler(IPreservableEntityHandler handler);

    void registerEntity(Class<? extends Entity> entityCls, EntityDimensions dimensions);

    EntityDimensions getEntityDimensions(Entity entity);

    boolean canBePreserved(Entity entity);
}
