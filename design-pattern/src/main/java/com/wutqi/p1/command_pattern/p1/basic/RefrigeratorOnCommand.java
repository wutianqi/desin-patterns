package com.wutqi.p1.command_pattern.p1.basic;

/**
 * 开冰箱命令
 * @author wuqi
 * @Date 2019/1/29 13:59
 */
public class RefrigeratorOnCommand implements Command {
    private Refrigerator refrigerator;
    private Integer preStatus;

    public RefrigeratorOnCommand(Refrigerator refrigerator){
        this.refrigerator = refrigerator;
    }

    @Override
    public void execute() {
        preStatus = refrigerator.getStatus();
        refrigerator.on();
    }

    @Override
    public void undo() {
        if(Refrigerator.ON.equals(preStatus)){
            refrigerator.on();
        } else {
            refrigerator.off();
        }
    }
}
