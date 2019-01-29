package com.wutqi.e.sixthChap.command;

/**
 * @author wuqi
 * @Date 2019/1/26 15:17
 */
public class CellingFanHighCommand implements Command {
    private CellingFan cellingFan;
    private Integer preSpeed;

    public CellingFanHighCommand(CellingFan cellingFan){
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        this.preSpeed = cellingFan.getSpeed();
        cellingFan.high();
    }

    @Override
    public void undo() {
        if(preSpeed.equals(CellingFan.HIGHT)){
            cellingFan.high();
        } else if(preSpeed.equals(CellingFan.MEDIUM)){
            cellingFan.medium();
        } else if(preSpeed.equals(CellingFan.LOW)){
            cellingFan.low();
        } else {
            cellingFan.off();
        }
    }
}
