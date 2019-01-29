package com.wutqi.e.sixthChap.command;

import java.util.Collections;

/**
 * @author wuqi
 * @Date 2019/1/26 17:19
 */
public class MacroCommandTest {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

        CellingFan cellingFan = new CellingFan();
        CellingFanHighCommand cellingFanHighCommand = new CellingFanHighCommand(cellingFan);
        CellingFanOffCommand cellingFanOffCommand = new CellingFanOffCommand(cellingFan);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorOffCommand garageDoorOffCommand = new GarageDoorOffCommand(garageDoor);

        MacroCommand onMacroCommand = new MacroCommand();
        MacroCommand offMacroCommand = new MacroCommand();
        Command[] onCommand = {lightOnCommand,cellingFanHighCommand,garageDoorOpenCommand};
        Command[] offCommand = {lightOffCommand,cellingFanOffCommand,garageDoorOffCommand};
        onMacroCommand.setCommands(onCommand);
        offMacroCommand.setCommands(offCommand);

        RemoteControlHasUndo remoteControlHasUndo = new RemoteControlHasUndo();
        remoteControlHasUndo.setCommand(0,onMacroCommand,offMacroCommand);
        remoteControlHasUndo.onButtonWasPushed(0);
        remoteControlHasUndo.offButtonWasPushed(0);
        remoteControlHasUndo.undo();
    }
}
