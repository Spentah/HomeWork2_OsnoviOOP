import animals.*;
import food.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Bear bear = new Bear();
        Fish fish = new Fish();
        Cow cow = new Cow();
        Duck duck = new Duck();
        Giraffe giraffe = new Giraffe();
        Worker worker = new Worker();
        ChickenMeat chickenMeat = new ChickenMeat();
        Clever clever = new Clever();
        CowMeat cowMeat = new CowMeat();
        Lupin lupin = new Lupin();
        PigMeat pigMeat = new PigMeat();
        Wheat wheat = new Wheat();

        worker.feed(wheat,bear);
        worker.feed(pigMeat,giraffe);
        worker.feed(pigMeat,tiger);
        worker.feed(chickenMeat,tiger);
        worker.getVoice(cow);
        tiger.getSatiety();

//        worker.getVoice(fish);
        Swim[] pool1 = {fish, duck, new Fish()};
        Arrays.stream(pool1).forEach(swim -> swim.swim());

    }
}
