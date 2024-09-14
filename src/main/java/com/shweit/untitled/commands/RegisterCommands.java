package com.shweit.untitled.commands;

import com.shweit.untitled.Untitled;
import com.shweit.untitled.commands.version.VersionCommand;

import java.util.List;

public abstract class RegisterCommands {
    public static void register() {
        List<SubCommand> subCommands = List.of(
            new VersionCommand()
        );
        CommandManager mainCommandManager = new CommandManager(subCommands);
        Untitled.getInstance().getCommand("untitled").setExecutor(mainCommandManager);
    }
}
