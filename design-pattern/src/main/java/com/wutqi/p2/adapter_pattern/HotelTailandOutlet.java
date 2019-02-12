package com.wutqi.p2.adapter_pattern;

/**
 * 泰国酒店的插座
 * @author wuqi
 * @Date 2019/2/11 11:42
 */
public class HotelTailandOutlet implements TailandOutlet {

    @Override
    public void work() {
        System.out.println("HotelTailandOutlet work,charging...");
    }
}
