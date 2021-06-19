package animals;

import food.Food;
import food.Meat;

public abstract class Herbivore extends Animal{

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Травоядные не едят мясо!");
        } else {
            System.out.println("Травоядная зверушка покормлена");
            satiety += food.getEnergy();
        }
    }
}
