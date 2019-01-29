package com.wutqi.p1.command_pattern.p1.basic;

/**
 * 测试遥控器
 * @author wuqi
 * @Date 2019/1/29 14:20
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        //创建电器
        Light livingRoomLight = new Light();
        AirCondition airCondition = new AirCondition();
        Refrigerator refrigerator = new Refrigerator();

        //创建遥控器，并给遥控器的三个插槽对应的on和off按钮指定命令
        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);
        AirConditionOnCommand airConditionOnCommand = new AirConditionOnCommand(airCondition);
        AirConditionOffCommand airConditionOffCommand = new AirConditionOffCommand(airCondition);
        RefrigeratorOnCommand refrigeratorOnCommand = new RefrigeratorOnCommand(refrigerator);
        RefrigeratorOffCommand refrigeratorOffCommand = new RefrigeratorOffCommand(refrigerator);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0,lightOnCommand,lightOffCommand);
        remoteControl.setCommand(1,airConditionOnCommand,airConditionOffCommand);
        remoteControl.setCommand(2,refrigeratorOnCommand,refrigeratorOffCommand);

        //打开电灯
        remoteControl.onButtonPushed(0);
        //关上电灯
        remoteControl.offButtonPushed(0);
        //按下撤销键，再次开启电灯
        remoteControl.undo();

        //打开空调
        remoteControl.onButtonPushed(1);
        //关上空调
        remoteControl.offButtonPushed(1);

        //打开冰箱
        remoteControl.onButtonPushed(2);
        //关闭冰箱
        remoteControl.offButtonPushed(2);
        //按下撤销键，再次打开冰箱
        remoteControl.undo();

    }
}
