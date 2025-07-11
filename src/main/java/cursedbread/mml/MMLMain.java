package cursedbread.mml;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class MMLMain implements ModInitializer, RecipeEntrypoint, GameStartEntrypoint {
    public static final String MOD_ID = "mml";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static boolean siOn = FabricLoader.getInstance().isModLoaded("signalindustries");
	public static boolean deepOn = FabricLoader.getInstance().isModLoaded("deep");
    @Override
    public void onInitialize() {
        LOGGER.info("More Moon Loot");
    }

	@Override
	public void onRecipesReady() {

	}

	@Override
	public void initNamespaces() {

	}

	@Override
	public void beforeGameStart() {

	}

	@Override
	public void afterGameStart() {

	}
}
