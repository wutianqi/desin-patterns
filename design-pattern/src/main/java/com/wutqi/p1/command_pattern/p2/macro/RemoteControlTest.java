package com.wutqi.p1.command_pattern.p2.macro;

import com.wutqi.p1.command_pattern.p1.basic.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 宏命令测试
 * @author wuqi
 * @Date 2019/1/29 17:49
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        //创建电器
        Light livingRoomLight = new Light();
        AirCondition airCondition = new AirCondition();
        Refrigerator refrigerator = new Refrigerator();

        //创建宏命令并将其设置到遥控器中
        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);
        AirConditionOnCommand airConditionOnCommand = new AirConditionOnCommand(airCondition);
        AirConditionOffCommand airConditionOffCommand = new AirConditionOffCommand(airCondition);
        RefrigeratorOnCommand refrigeratorOnCommand = new RefrigeratorOnCommand(refrigerator);
        RefrigeratorOffCommand refrigeratorOffCommand = new RefrigeratorOffCommand(refrigerator);
        List<Command> onCommands = new ArrayList<>();
        onCommands.add(lightOnCommand);
        onCommands.add(airConditionOnCommand);
        onCommands.add(refrigeratorOnCommand);
        List<Command> offCommands = new ArrayList<>();
        offCommands.add(lightOffCommand);
        offCommands.add(airConditionOffCommand);
        offCommands.add(refrigeratorOffCommand);
        MacroCommand onMacroCommand = new MacroCommand(onCommands);
        MacroCommand offMacroCommad = new MacroCommand(offCommands);
        RemoteControl remoteControl = new RemoteControl();
    }
}
