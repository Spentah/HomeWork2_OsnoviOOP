package animals;

import java.util.Objects;

public class Tiger extends Carnivorous implements Run, Voice{
    private String nickname;
    private int animalSize = 150;

    public String getNickname() {
        return nickname;
    }

    @Override
    public int getAnimalSize() {
        return animalSize;
    }

    public Tiger(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String voice() {
        return "Rrrrrrrr";
    }

    @Override
    public void run() {
        System.out.println("Тигр бегает");
    }

    @Override
    public void treadOnTheGround() {
        System.out.println("Тигр топчется на месте");
    }

    @Override
    public void walkingStep() {
        System.out.println("Тигр прогуливается");
    }

    @Override
    public String getName() {
        return "Тигр";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tiger tiger = (Tiger) o;
        return Objects.equals(nickname, tiger.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }
}
