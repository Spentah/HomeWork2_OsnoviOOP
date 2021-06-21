package animals;

import food.Food;
import food.Grass;

public abstract class Carnivorous extends Animal{

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            throw new WrongFoodException("Хищники не едят траву!");
        } else {
            System.out.println("Хищная зверушка покормлена");
            satiety += food.getEnergy();
        }
    }

}
