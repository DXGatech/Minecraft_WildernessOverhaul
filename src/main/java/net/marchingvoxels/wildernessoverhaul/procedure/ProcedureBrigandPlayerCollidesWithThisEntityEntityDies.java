package net.marchingvoxels.wildernessoverhaul.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.marchingvoxels.wildernessoverhaul.ElementsWildernessOverhaul;

@ElementsWildernessOverhaul.ModElement.Tag
public class ProcedureBrigandPlayerCollidesWithThisEntityEntityDies extends ElementsWildernessOverhaul.ModElement {
	public ProcedureBrigandPlayerCollidesWithThisEntityEntityDies(ElementsWildernessOverhaul instance) {
		super(instance, 8);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BrigandPlayerCollidesWithThisEntityEntityDies!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BrigandPlayerCollidesWithThisEntityEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BrigandPlayerCollidesWithThisEntityEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BrigandPlayerCollidesWithThisEntityEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BrigandPlayerCollidesWithThisEntityEntityDies!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (world instanceof WorldServer)
			((WorldServer) world).spawnParticle(EnumParticleTypes.SMOKE_LARGE, x, y, z, (int) 5, 3, 3, 3, 1, new int[0]);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).closeScreen();
	}
}
