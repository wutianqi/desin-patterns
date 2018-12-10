package com.wutqi.c.thirdChap.decorate.iodecorator;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @author wuqi
 * @Date 2018/12/10 15:41
 */
public class TestDemo {
    public static void main(String[] args) throws IOException {
        String str = "I know you are WINNER";

        LowerCaseInputStream inputStream = new LowerCaseInputStream(new ByteArrayInputStream(str.getBytes()));

        int c = -1;
        while ((c = inputStream.read()) != -1){
            System.out.print((char)c);
        }

        inputStream.close();
    }
}
