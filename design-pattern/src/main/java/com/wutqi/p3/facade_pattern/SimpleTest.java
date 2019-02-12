package com.wutqi.p3.facade_pattern;

/**
 * 不使用外观模式观看电视剧
 * @author wuqi
 * @Date 2019/2/12 10:04
 */
public class SimpleTest {
    public static void main(String[] args) {
        Light light = new Light();
        AirCondition airCondition = new AirCondition();
        PowerWindow powerWindow = new PowerWindow();
        TV tv = new TV();

        light.open();
        airCondition.open();
        powerWindow.close();
        tv.open();

//        light.close();
//        airCondition.close();
//        powerWindow.open();
//        tv.close();
    }
}
