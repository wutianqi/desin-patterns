package com.wutqi.p1.command_pattern.p4.log;

import com.wutqi.p1.command_pattern.p1.basic.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuqi
 * @Date 2019/1/30 14:37
 */
public class ActionCommandTest {
    public static void main(String[] args) {
        //创建存储执行命令的地方
        List<Command> commandLogs = new ArrayList<>();
        //创建命令的发出者，电脑
        Computer computer = new Computer(commandLogs);
        for(int i=0;i<5;i++){
            ActionCommand actionCommand = new ActionCommand("" + i);
            computer.setCommand(actionCommand);
            computer.execute();
        }
        //存储命令
        computer.store();
        try{
            //模拟电脑死机
            int a = 1/0;
        }catch (Exception e){
            System.out.println("the computer is bung!");
            //电脑重启，加载存储命令的文件并进行恢复，这里是从storedCommands中取储命令进行恢复。正常情况下应该先从文件中取出storeCommands，再执行
            System.out.println("the computer is restart,begin load action");
            computer.load();
        }

    }
}
