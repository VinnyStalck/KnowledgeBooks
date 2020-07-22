package me.stalckvinny.knowledgebooks;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class KnowledgeBooks implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "knowledgebooks";
    public static final String MOD_NAME = "Knowledge Books";

    @Override
    public void onInitialize() {
		//TODO: Initializer
        log(Level.INFO, "Initialized");
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}