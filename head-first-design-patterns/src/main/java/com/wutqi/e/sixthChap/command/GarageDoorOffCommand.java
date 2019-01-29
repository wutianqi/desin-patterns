package com.wutqi.e.sixthChap.command;

/**
 * @author wuqi
 * @Date 2019/1/26 14:52
 */
public class GarageDoorOffCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOffCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
