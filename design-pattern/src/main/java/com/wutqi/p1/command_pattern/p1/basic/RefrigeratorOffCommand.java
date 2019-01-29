package com.wutqi.p1.command_pattern.p1.basic;

/**
 * 冰箱关命令
 * @author wuqi
 * @Date 2019/1/29 14:01
 */
public class RefrigeratorOffCommand implements Command {
    private Refrigerator refrigerator;
    private Integer preStatus;

    public RefrigeratorOffCommand(Refrigerator refrigerator){
        this.refrigerator = refrigerator;
    }

    @Override
    public void execute() {
        preStatus = refrigerator.getStatus();
        refrigerator.off();
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
