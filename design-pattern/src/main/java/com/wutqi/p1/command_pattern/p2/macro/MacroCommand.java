package com.wutqi.p1.command_pattern.p2.macro;

import com.wutqi.p1.command_pattern.p1.basic.Command;

import java.util.List;

/**
 * 宏命令
 * @author wuqi
 * @Date 2019/1/29 17:44
 */
public class MacroCommand implements Command {
    private List<Command> commands;

    public MacroCommand(List<Command> commands){
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(Command command : commands){
            command.execute();
        }
    }

    @Override
    public void undo() {
        for(int i=commands.size();i>0;i--){
            commands.get(i).undo();
        }
    }

}
