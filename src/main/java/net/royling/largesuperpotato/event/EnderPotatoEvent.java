package net.royling.largesuperpotato.event;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.level.Level;

public class EnderPotatoEvent {
    public static void execute(Entity entity){
        if(entity == null)
            return;
        {
            Entity _shootFrom = entity;
            Level projectileLevel = _shootFrom.level();
            if(!projectileLevel.isClientSide()){
                Projectile _entityToSpawn = new Object(){
                    public Projectile getProjectile(Level level,Entity shooter){
                        Projectile entityToSpawn = new ThrownEnderpearl(EntityType.ENDER_PEARL,level);
                        entityToSpawn.setOwner(shooter);
                        return entityToSpawn;
                    }
                }.getProjectile(projectileLevel, entity);
                _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
                _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
                projectileLevel.addFreshEntity(_entityToSpawn);

            }
        }
    }
}
