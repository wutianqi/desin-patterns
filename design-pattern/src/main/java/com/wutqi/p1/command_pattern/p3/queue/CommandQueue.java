package com.wutqi.p1.command_pattern.p3.queue;

import com.wutqi.p1.command_pattern.p1.basic.Command;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 命令队列
 * @author wuqi
 * @Date 2019/1/30 13:26
 */
public class CommandQueue {
    private LinkedList<Command> commands;

    public CommandQueue(){
        commands = new LinkedList<>();
    }

    public synchronized void addCommand(Command command){
        commands.add(command);
    }

    public synchronized Command getCommand(){
        if(commands.size() != 0){
            return commands.removeLast();
        }

        return null;
    }
}
