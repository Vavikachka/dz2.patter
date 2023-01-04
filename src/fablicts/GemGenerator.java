package fablicts;

import interfaces.GameItem;
import interfaces.ITemGenerator;
import rewards.GemReward;

// еще одна фабрика
public class GemGenerator extends ITemGenerator {
    @Override   //переопределяем
    public GameItem createIterm() {
        return new GemReward();
    }
}
