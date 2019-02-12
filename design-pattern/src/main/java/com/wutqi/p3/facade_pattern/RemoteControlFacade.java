package com.wutqi.p3.facade_pattern;

/**
 * 遥控器。将各个电器的操作整合在一起，充当了外观的角色。
 * @author wuqi
 * @Date 2019/2/11 14:50
 */
public class RemoteControlFacade {
    private Light light;
    private AirCondition airCondition;
    private PowerWindow powerWindow;
    private TV tv;

    public RemoteControlFacade(Light light,
                               AirCondition airCondition,
                               PowerWindow powerWindow,
                               TV tv){
        this.light = light;
        this.airCondition = airCondition;
        this.powerWindow = powerWindow;
        this.tv = tv;
    }

    /**
     * 看电视
     */
    public void pushOpenTvButton(){
        light.open();
        airCondition.open();
        powerWindow.close();
        tv.open();
    }

    /**
     *关闭电视
     */
    public void pushCloseTvButton(){
        light.close();
        airCondition.close();
        powerWindow.open();
        tv.close();
    }
}
