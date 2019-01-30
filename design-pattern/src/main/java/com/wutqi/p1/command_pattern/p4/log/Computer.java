package com.wutqi.p1.command_pattern.p4.log;

import com.wutqi.p1.command_pattern.p1.basic.Command;

import java.util.List;

/**
 * 电脑，命令调用者
 * @author wuqi
 * @Date 2019/1/30 15:46
 */
public class Computer {
    //执行的命令日志
    private List<Command> commandLogs;
    private Command command;

    public Computer(List<Command> commandLogs){
        this.commandLogs = commandLogs;
    }

    public void execute(){
        this.command.execute();
        commandLogs.add(command);
    }

    public void setCommand(Command command){
        this.command = command;
    }

    /**
     * 存储
     */
    public void store(){
        //存储命令日志，实际中是将其存储在文件中
        System.out.println("commandLogs is been stored");
    }

    /**
     * 加载
     */
    public void load(){
        //实际上是从文件中取出commandLogs然后执行之前执行过的命令对象
        for(Command c : commandLogs){
            c.execute();
        }
    }

}
