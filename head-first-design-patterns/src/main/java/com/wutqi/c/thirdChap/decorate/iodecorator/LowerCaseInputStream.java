package com.wutqi.c.thirdChap.decorate.iodecorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 继承InpuStream的装饰类FilterInputStream来装饰InputStream
 * @author wuqi
 * @Date 2018/12/10 15:26
 */
public class LowerCaseInputStream extends FilterInputStream {
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c==-1? c:Character.toLowerCase(c);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int count = super.read(b, off, len);
        for(int i = off; i < off + count; i++){
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return count;

    }

}
