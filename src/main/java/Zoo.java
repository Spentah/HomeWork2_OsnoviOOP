import animals.*;
import food.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

        List<Animal> animals = Arrays.asList(tiger, fish, bear, cow, duck, giraffe);
        List<Food> food = Arrays.asList(chickenMeat, clever, cowMeat, lupin, pigMeat, wheat);
        for (Animal animal : animals) {
            for (Food food1 : food) {
                worker.feed(food1, animal);
            }
        }

        worker.getVoice(cow);
        tiger.getSatiety();

//        worker.getVoice(fish);
        Swim[] pool1 = {fish, duck, new Fish()};
        Arrays.stream(pool1).forEach(swim -> swim.swim());

    }
}
