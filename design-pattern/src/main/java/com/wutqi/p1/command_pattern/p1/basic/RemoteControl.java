package com.wutqi.p1.command_pattern.p1.basic;

/**
 * 遥控器
 * @author wuqi
 * @Date 2019/1/29 14:02
 */
public class RemoteControl {
    /**
     * on按钮
     */
    private Command[] onCommands;
    /**
     * off按钮
     */
    private Command[] offCommands;
    /**
     * undo按钮
     */
    private Command undoCommand;
    /**
     * 最后一个命令
     */
    private Command lastCommand;

    public RemoteControl(){
        //遥控器初始化时，将所有的按钮对应的命令设置成Nocommand，即按下时没有任何反应
        NoCommand noCommand = new NoCommand();
        onCommands = new Command[3];
        offCommands = new Command[3];
        for(int i=0;i<3;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    /**
     * 设置按钮指令
     * @param slot
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int slot,Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * 选择按第几号on按钮
     * @param position
     */
    public void onButtonPushed(int position){
        this.lastCommand = onCommands[position];
        onCommands[position].execute();
    }

    /**
     * 选择按第几号off按钮
     * @param position
     */
    public void offButtonPushed(int position){
        this.lastCommand = offCommands[position];
        offCommands[position].execute();
    }

    /**
     * 撤销最后一次执行的命令
     */
    public void undo(){
        lastCommand.undo();
    }
}
