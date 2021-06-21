package animals;

import java.util.Objects;

public class Duck extends Herbivore implements Fly,Voice,Swim{
    private String nickname;
    private int animalSize = 75;

    public String getNickname() {
        return nickname;
    }

    @Override
    public int getAnimalSize() {
        return animalSize;
    }

    public Duck(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String voice() {
        return "Quack";
    }

    @Override
    public void fly() {
        System.out.println("Утка летает");
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }

    @Override
    public String getName() {
        return "Утка";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duck duck = (Duck) o;
        return Objects.equals(nickname, duck.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }
}
