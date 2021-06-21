package animals;

import java.util.Objects;

public class Fish extends Carnivorous implements Swim{
    private String nickname;
    private int animalSize = 50;

    public String getNickname() {
        return nickname;
    }

    @Override
    public int getAnimalSize() {
        return animalSize;
    }

    public Fish(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void swim() {
        System.out.println("Рыба плавает");
    }

    @Override
    public String getName() {
        return "Рыба";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fish fish = (Fish) o;
        return Objects.equals(nickname, fish.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }
}
