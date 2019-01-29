package com.wutqi.p1.command_pattern;

/**
 * 命令接口
 * @author wuqi
 * @Date 2019/1/29 13:33
 */
public interface Command {
    /**
     * 执行命令
     */
    public void execute();

    /**
     * 撤销命令
     */
    public void undo();
}
