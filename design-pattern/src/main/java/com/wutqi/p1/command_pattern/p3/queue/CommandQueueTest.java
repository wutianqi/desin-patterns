package com.wutqi.p1.command_pattern.p3.queue;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author wuqi
 * @Date 2019/1/30 13:34
 */
public class CommandQueueTest {
    public static void main(String[] args) {
        //创建请求队列
        CommandQueue commandQueue = new CommandQueue();
        //创建请求命令
        for(int i=0;i<15;i++){
            RequestCommand requestCommand = new RequestCommand("request" + i);
            commandQueue.addCommand(requestCommand);
        }

        //多线程执行请求队列中的命令
        for(int i=0;i<15;i++){
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        //从命令队列中取出命令执行
                        commandQueue.getCommand().execute();
                    }
                });
            thread.start();
        }


    }
}
