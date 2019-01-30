package com.wutqi.p1.command_pattern.p3.queue;

import com.wutqi.p1.command_pattern.p1.basic.Command;

/**
 * 请求命令
 * @author wuqi
 * @Date 2019/1/30 13:33
 */
public class RequestCommand implements Command {
    private String name;

    public RequestCommand(String name){
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("process request " + name);
    }

    @Override
    public void undo() {
        //请求命令没有撤销功能，这里不做任何处理
    }
}
