package com.wutqi.p1.command_pattern;

/**
 * 开灯命令
 * @author wuqi
 * @Date 2019/1/29 13:36
 */
public class LightOnCommand implements Command{
    private Light light;
    private Integer preStatus;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        preStatus = light.getStatus();
        light.on();
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
