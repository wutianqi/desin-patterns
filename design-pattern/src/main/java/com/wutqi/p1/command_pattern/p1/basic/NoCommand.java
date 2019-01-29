package com.wutqi.p1.command_pattern.p1.basic;

/**
 * 无任何响应的命令
 * @author wuqi
 * @Date 2019/1/29 14:14
 */
public class NoCommand implements Command {


    @Override
    public void execute() {
        //不做任何事情
    }

    @Override
    public void undo() {
        //不做任何事情
    }
}
