package net.marchingvoxels.wildernessoverhaul.procedure;

import net.minecraft.util.EnumHand;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.marchingvoxels.wildernessoverhaul.ElementsWildernessOverhaul;

@ElementsWildernessOverhaul.ModElement.Tag
public class ProcedureWildernessOverhaulCreaturesEntityFalls extends ElementsWildernessOverhaul.ModElement {
	public ProcedureWildernessOverhaulCreaturesEntityFalls(ElementsWildernessOverhaul instance) {
		super(instance, 2);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure WildernessOverhaulCreaturesEntityFalls!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase) {
			((EntityLivingBase) entity).swingArm(EnumHand.OFF_HAND);
		}
		if (entity instanceof EntityLivingBase) {
			((EntityLivingBase) entity).swingArm(EnumHand.MAIN_HAND);
		}
		entity.rotationYaw = 0;
		entity.rotationPitch = 0;
	}
}
