package com.wutqi.p1.command_pattern.p4.log;

import com.wutqi.p1.command_pattern.p1.basic.Command;

import java.util.List;

/**
 * 动作命令
 * @author wuqi
 * @Date 2019/1/30 14:33
 */
public class ActionCommand implements Command {
    /**
     * 动作名称
     */
    private String name;

    public ActionCommand(String name){
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("action " + name + " is been execute...");
    }

    @Override
    public void undo() {

    }
}
