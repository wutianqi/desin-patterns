package com.wutqi.e.sixthChap.command;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author wuqi
 * @Date 2019/1/26 15:34
 */
public class RemoteControlHasUndo {
    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> finishedCommands;

    public RemoteControlHasUndo(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i=0; i<7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        finishedCommands = new Stack<>();
        finishedCommands.push(noCommand);
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        finishedCommands.push(onCommands[slot]);
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot){
        finishedCommands.push(offCommands[slot]);
        offCommands[slot].execute();
    }

    public void undo(){
        for(int i=0; i< finishedCommands.size(); i++){
            finishedCommands.pop().undo();
        }
    }

    @Override
    public String toString() {
        //[0]:onCommand=CellingFanHighCommand, offCommand=CellingFanOffCommand
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0; i<7; i++){
            stringBuffer.append("[").append(i).append("]:onCommand=").append(onCommands[i].getClass().getName()).append(", offCommand=").append(offCommands[i].getClass().getName());
            stringBuffer.append("\n\r");
        }
        stringBuffer.append("[undo]:undoCommand=");
        for(int i=0; i < finishedCommands.size(); i++){
            stringBuffer.append(finishedCommands.get(i).getClass().getName());

        }
        return stringBuffer.toString();
    }
}
