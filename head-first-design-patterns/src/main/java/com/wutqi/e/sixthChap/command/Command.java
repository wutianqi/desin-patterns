package com.wutqi.e.sixthChap.command;

/**
 * 命令
 * @author wuqi
 * @Date 2019/1/25 10:34
 */
public interface Command {
    void execute();
    void undo();
}
