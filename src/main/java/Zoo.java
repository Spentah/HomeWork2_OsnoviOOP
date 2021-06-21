import animals.*;
import food.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Тигра");
        Bear bear = new Bear("Миша");
        Fish fish = new Fish("Карпик");
        Cow cow = new Cow("Буренка");
        Duck duck = new Duck("Дональд");
        Giraffe giraffe = new Giraffe("Мелман");
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
        Swim[] pool1 = {fish, duck, new Fish("Виталик")};
        Arrays.stream(pool1).forEach(swim -> swim.swim());

        Aviary<Animal> aviary = new Aviary<>(AviarySize.MEDIUM);
        aviary.addAnimal(duck);
        aviary.addAnimal(tiger);
        aviary.addAnimal(cow);
        aviary.addAnimal(bear);
        aviary.addAnimal(new Cow("Муренка"));
        aviary.addAnimal(new Cow("Борька"));
        aviary.getAnimal("Дональд");
        aviary.removeAnimal("Дональд");





    }
}
