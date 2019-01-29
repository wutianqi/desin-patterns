package com.wutqi.e.sixthChap.command;

/**
 * @author wuqi
 * @Date 2019/1/26 15:43
 */
public class RemoteControlHasUndoTest {

    public static void main(String[] args) {
        RemoteControlHasUndo remoteControlHasUndo = new RemoteControlHasUndo();

        CellingFan cellingFan = new CellingFan();
        CellingFanHighCommand cellingFanHighCommand = new CellingFanHighCommand(cellingFan);
        CellingFanOffCommand cellingFanOffCommand = new CellingFanOffCommand(cellingFan);

        remoteControlHasUndo.setCommand(0,cellingFanHighCommand,cellingFanOffCommand);

        remoteControlHasUndo.onButtonWasPushed(0);
        remoteControlHasUndo.offButtonWasPushed(0);
        System.out.println(remoteControlHasUndo);
        remoteControlHasUndo.undo();

        remoteControlHasUndo.offButtonWasPushed(0);
        remoteControlHasUndo.onButtonWasPushed(0);
        System.out.println(remoteControlHasUndo);
        remoteControlHasUndo.undo();


    }
}
