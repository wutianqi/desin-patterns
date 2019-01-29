package com.wutqi.e.sixthChap.command;

/**
 * 宏命令
 * @author wuqi
 * @Date 2019/1/26 17:16
 */
public class MacroCommand implements Command {
    private Command[] commands;

    @Override
    public void execute() {
        for(Command onCommand: commands){
            onCommand.execute();
        }
    }

    @Override
    public void undo() {
        for(Command command : commands){
            command.undo();
        }
    }

    public void setCommands(Command[] commands) {
        this.commands = commands;
    }

}
