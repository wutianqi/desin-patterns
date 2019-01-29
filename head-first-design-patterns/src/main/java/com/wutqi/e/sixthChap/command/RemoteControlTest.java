package com.wutqi.e.sixthChap.command;

/**
 * @author wuqi
 * @Date 2019/1/25 10:53
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        //遥控器
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        //接收者
        Light light = new Light();

        //命令
        Command command = new LightOnCommand(light);

        //设置命令
        simpleRemoteControl.setCommand(command);

        //执行命令
        simpleRemoteControl.buttonWasPressed();
    }
}
