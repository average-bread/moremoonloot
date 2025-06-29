package cursedbread.mml.mixin;

import net.minecraft.core.block.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import sunsetsatellite.signalindustries.blocks.logic.BlockLogicOreDilithium;
import sunsetsatellite.signalindustries.blocks.logic.BlockLogicOreDimensionalShard;
import sunsetsatellite.signalindustries.blocks.logic.BlockLogicOreSignalite;
import useless.moonsteel.MoonSteelBlocks;

@Mixin(value = MoonSteelBlocks.class, remap = false)

public class ModOreFortune {
	@Inject(method = "canBeFortuned(Lnet/minecraft/core/block/Block;)Z", at = @At("HEAD"), cancellable = true)
	private static void canBeFortuned(Block block, CallbackInfoReturnable<Boolean> cir){
		if (Block.hasLogicClass(block, BlockLogicOreDilithium.class)) cir.setReturnValue(true);
		if (Block.hasLogicClass(block, BlockLogicOreSignalite.class)) cir.setReturnValue(true);
		if (Block.hasLogicClass(block, BlockLogicOreDimensionalShard.class)) cir.setReturnValue(true);
	}
}

