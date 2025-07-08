package cursedbread.mml.mixin;

import cursedbread.mml.MMLMain;
import net.minecraft.core.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import silveon22.deep.block.ore.*;
import sunsetsatellite.signalindustries.blocks.logic.BlockLogicOreDilithium;
import sunsetsatellite.signalindustries.blocks.logic.BlockLogicOreDimensionalShard;
import sunsetsatellite.signalindustries.blocks.logic.BlockLogicOreSignalite;
import useless.moonsteel.MoonSteelBlocks;

@Mixin(value = MoonSteelBlocks.class, remap = false)

public class DeepOreFortune {
	@Inject(method = "canBeFortuned(Lnet/minecraft/core/block/Block;)Z", at = @At("HEAD"), cancellable = true)
	private static void canBeFortuned(Block block, CallbackInfoReturnable<Boolean> cir){
		if (MMLMain.deepOn){
			if (Block.hasLogicClass(block, BlockLogicRhodoniteOre.class)) cir.setReturnValue(true);
			if (Block.hasLogicClass(block, BlockLogicAmethystOre.class)) cir.setReturnValue(true);
			if (Block.hasLogicClass(block, BlockLogicSilverOre.class)) cir.setReturnValue(true);
			if (Block.hasLogicClass(block, BlockLogicUraniumOre.class)) cir.setReturnValue(true);
			if (Block.hasLogicClass(block, BlockLogicLeadOre.class)) cir.setReturnValue(true);
			if (Block.hasLogicClass(block, BlockLogicTopazOre.class)) cir.setReturnValue(true);
		}
	}
}

