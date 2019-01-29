package com.wutqi.p1.command_pattern;

/**
 * 关空调命令
 * @author wuqi
 * @Date 2019/1/29 13:58
 */
public class AirConditionOffCommand implements Command {
    private AirCondition airCondition;
    private Integer preStatus;

    public AirConditionOffCommand(AirCondition airCondition){
        this.airCondition = airCondition;
    }

    @Override
    public void execute() {
        preStatus = airCondition.getStatus();
        airCondition.off();
    }

    @Override
    public void undo() {
        if(AirCondition.ON.equals(preStatus)){
            airCondition.on();
        } else {
            airCondition.off();
        }
    }
}
