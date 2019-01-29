package com.wutqi.p1.command_pattern.p1.basic;

/**
 * 开空调命令
 * @author wuqi
 * @Date 2019/1/29 13:56
 */
public class AirConditionOnCommand implements Command {
    private AirCondition airCondition;
    private Integer preStatus;

    public AirConditionOnCommand(AirCondition airCondition){
        this.airCondition = airCondition;
    }

    @Override
    public void execute() {
        preStatus = airCondition.getStatus();
        airCondition.on();
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
