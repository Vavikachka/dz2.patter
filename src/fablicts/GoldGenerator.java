package fablicts;

import interfaces.GameItem;
import interfaces.ITemGenerator;
import rewards.GoldReward;

// делаем фабрику которая наследует ITemGenerator. возвращает продукт
public class GoldGenerator extends ITemGenerator {
    @Override   //переопределяем
    public GameItem createIterm(){
        return new GoldReward();
    }
}

