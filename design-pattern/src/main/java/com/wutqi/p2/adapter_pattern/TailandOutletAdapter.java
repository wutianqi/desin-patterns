package com.wutqi.p2.adapter_pattern;

/**
 * 泰国插座适配器
 * @author wuqi
 * @Date 2019/2/11 13:47
 */
public class TailandOutletAdapter implements ChinaOutlet {
    TailandOutlet tailandOutlet;

    public TailandOutletAdapter(TailandOutlet tailandOutlet){
        this.tailandOutlet = tailandOutlet;
    }

    @Override
    public void work() {
        tailandOutlet.work();
    }
}
