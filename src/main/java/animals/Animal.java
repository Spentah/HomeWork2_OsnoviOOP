package animals;

import food.Food;

public abstract class Animal {
    protected int satiety = 0;

    public abstract void eat(Food food);

    public void getSatiety() {
        System.out.printf("Покормили животное - %s. Его сытость - %s\n", getName(),satiety);
    }

    public abstract String getName();
}
