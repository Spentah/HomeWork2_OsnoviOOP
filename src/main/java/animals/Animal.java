package animals;

import food.Food;

import java.util.Objects;

public abstract class Animal {
    protected int satiety = 0;

    private int animalSize;

    private String nickname;

    public abstract void eat(Food food) throws WrongFoodException;

    public void getSatiety() {
        System.out.printf("Покормили животное - %s. Его сытость - %s\n", getName(),satiety);
    }

    public abstract String getName();

    public String getNickname() {
        return nickname;
    }

    public int getAnimalSize(){
        return animalSize;
    }


}
