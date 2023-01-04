//FactoryMethod
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.List;
import fablicts.*;
public class Main {
    public static void main(String[] args) {

        Random random = ThreadLocalRandom.current();
        List<interfaces.ITemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new WoodGenerator());
        generatorList.add(new GemGenerator());
        generatorList.add(new GoldGenerator());
        generatorList.add(new DiamondGenerator());
        generatorList.add(new FoodGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new SulfurGenerator());


        for (int i = 0; i < 10; i++) {
            int index = Math.abs(random.nextInt(0,7));
            interfaces.ITemGenerator  iTemGenerator = generatorList.get(index);
            iTemGenerator.openReward();
        }

    }
}
//генератор вещей. он будет наследоваться. прообраз фабрики
//abstract class ITemGenerator {
//    public void openReward(){
//        GameItem gameItem = createIterm();
//        gameItem.open();
//    }
//    public abstract GameItem createIterm();
//}
// интерфейс который будет реализовываться
//interface GameItem{
//    void open();
//}

// делаем фабрику которая наследует ITemGenerator. возвращает продукт
//class GoldGenerator extends ITemGenerator{
//    @Override   //переопределяем
//    public GameItem createIterm(){
//        return new GoldReward();
//    }
//}

// еще одна фабрика
//class GemGenerator extends ITemGenerator{
//    @Override   //переопределяем
//    public GameItem createIterm(){
//        return new GemReward();
//    }
//}

// сама награда
//class  GoldReward implements GameItem{
//    @Override
//    public void open(){
//        System.out.println("Gold");
//    }
//}
//
//class  GemReward implements GameItem{
//    @Override
//    public void open(){
//        System.out.println("Gem");
//    }
//}