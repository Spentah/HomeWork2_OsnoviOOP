package animals;

import food.Food;
import food.Grass;

public abstract class Carnivorous extends Animal{

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Хищники не едят траву!");
        } else {
            System.out.println("Хищная зверушка покормлена");
            satiety += food.getEnergy();
        }
    }

}
