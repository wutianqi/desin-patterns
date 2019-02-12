package com.wutqi.p3.facade_pattern;

import com.wutqi.p1.command_pattern.p1.basic.RemoteControl;

/**
 * 外观模式测试
 * @author wuqi
 * @Date 2019/2/11 15:01
 */
public class FacadePatternTest {
    public static void main(String[] args) {
        Light light = new Light();
        AirCondition airCondition = new AirCondition();
        PowerWindow powerWindow = new PowerWindow();
        TV tv = new TV();

        //创建观看电视的外观类——遥控器
        RemoteControlFacade remoteControlFacade = new RemoteControlFacade(light,airCondition,powerWindow,tv);
        //观看电视
        remoteControlFacade.pushOpenTvButton();
        //结束观看
        remoteControlFacade.pushCloseTvButton();
    }
}
