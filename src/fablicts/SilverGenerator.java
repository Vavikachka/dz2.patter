package fablicts;

import interfaces.GameItem;
import interfaces.ITemGenerator;
import rewards.SilverRewars;

public class SilverGenerator extends ITemGenerator {
    @Override   //переопределяем
    public GameItem createIterm() {
        return new SilverRewars();
    }
}
