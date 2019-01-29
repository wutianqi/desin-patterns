package com.wutqi.e.sixthChap.command;

/**
 * @author wuqi
 * @Date 2019/1/26 14:51
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
