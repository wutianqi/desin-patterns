package com.wutqi.e.sixthChap.command;

/**
 * @author wuqi
 * @Date 2019/1/26 16:02
 */
public class CellingFanOffCommand implements Command {
    private CellingFan cellingFan;
    private Integer preSpeed;

    public CellingFanOffCommand(CellingFan cellingFan){
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        this.preSpeed = cellingFan.getSpeed();
        cellingFan.off();
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
