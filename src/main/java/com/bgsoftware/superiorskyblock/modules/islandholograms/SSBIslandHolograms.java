package com.bgsoftware.superiorskyblock.modules.islandholograms;

import com.bgsoftware.superiorskyblock.api.SuperiorSkyblock;
import com.bgsoftware.superiorskyblock.api.commands.SuperiorCommand;
import com.bgsoftware.superiorskyblock.api.modules.PluginModule;
import org.bukkit.event.Listener;

public final class SSBIslandHolograms extends PluginModule {

    public SSBIslandHolograms() {
        super("IslandHolograms", "Ome_R");
    }

    @Override
    public void onEnable(SuperiorSkyblock superiorSkyblock) {

    }

    @Override
    public void onReload(SuperiorSkyblock superiorSkyblock) {

    }

    @Override
    public void onDisable(SuperiorSkyblock superiorSkyblock) {

    }

    @Override
    public Listener[] getModuleListeners(SuperiorSkyblock superiorSkyblock) {
        return null;
    }

    @Override
    public SuperiorCommand[] getSuperiorCommands(SuperiorSkyblock superiorSkyblock) {
        return null;
    }

    @Override
    public SuperiorCommand[] getSuperiorAdminCommands(SuperiorSkyblock superiorSkyblock) {
        return null;
    }

}
