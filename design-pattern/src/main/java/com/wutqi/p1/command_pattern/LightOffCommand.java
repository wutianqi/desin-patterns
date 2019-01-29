package com.wutqi.p1.command_pattern;

/**
 * 关灯命令
 * @author wuqi
 * @Date 2019/1/29 13:55
 */
public class LightOffCommand implements Command {
    private Light light;
    private Integer preStatus;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        preStatus = light.getStatus();
        light.off();
    }

    @Override
    public void undo() {
        if(Light.ON.equals(preStatus)){
            light.on();
        } else {
            light.off();
        }
    }
}
