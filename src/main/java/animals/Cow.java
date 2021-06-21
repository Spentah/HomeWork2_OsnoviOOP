package animals;

import java.util.Objects;

public class Cow extends Herbivore implements Run, Voice{
    private String nickname;
    private int animalSize = 100;

    public String getNickname() {
        return nickname;
    }

    @Override
    public int getAnimalSize() {
        return animalSize;
    }

    public Cow(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void run() {
        System.out.println("Корова бегает");
    }

    @Override
    public void walkingStep() {
        System.out.println("Корова прогуливается");
    }

    @Override
    public void treadOnTheGround() {
        System.out.println("Корова топчется на месте");
    }

    @Override
    public String voice() {
        return "Mooooo";
    }

    @Override
    public String getName() {
        return "Корова";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cow cow = (Cow) o;
        return Objects.equals(nickname, cow.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }
}
