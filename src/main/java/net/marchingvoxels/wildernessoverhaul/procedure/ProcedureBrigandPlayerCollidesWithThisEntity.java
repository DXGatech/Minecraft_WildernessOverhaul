package net.marchingvoxels.wildernessoverhaul.procedure;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.marchingvoxels.wildernessoverhaul.ElementsWildernessOverhaul;

@ElementsWildernessOverhaul.ModElement.Tag
public class ProcedureBrigandPlayerCollidesWithThisEntity extends ElementsWildernessOverhaul.ModElement {
	public ProcedureBrigandPlayerCollidesWithThisEntity(ElementsWildernessOverhaul instance) {
		super(instance, 7);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BrigandPlayerCollidesWithThisEntity!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BrigandPlayerCollidesWithThisEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).capabilities.isCreativeMode : false)) {
			System.out.println("not attacking creative player");
		} else {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
			if (entity instanceof EntityPlayer && !world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Die!"), (false));
			}
		}
	}
}
