package com.wutqi.p2.adapter_pattern;

/**
 * 适配器模式测试
 * @author wuqi
 * @Date 2019/2/11 13:49
 */
public class AdapterPatternTest {
    public static void main(String[] args) {
        //泰国的插座
        HotelTailandOutlet hotelTailandOutlet = new HotelTailandOutlet();
        //泰国插座的适配器
        ChinaOutlet chinaOutlet = new TailandOutletAdapter(hotelTailandOutlet);

        HpComputer hpComputer = new HpComputer();
        hpComputer.charge(chinaOutlet);
    }
}
