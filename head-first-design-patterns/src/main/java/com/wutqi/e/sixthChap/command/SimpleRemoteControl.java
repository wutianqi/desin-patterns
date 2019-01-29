package com.wutqi.e.sixthChap.command;

/**
 * @author wuqi
 * @Date 2019/1/25 10:52
 */
public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl(){

    }

    public void setCommand(Command command){
        this.slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
