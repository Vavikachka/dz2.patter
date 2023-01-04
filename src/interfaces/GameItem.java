package interfaces;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// интерфейс который будет реализовываться
public interface GameItem {
    Random random = ThreadLocalRandom.current();
    void open();
}
