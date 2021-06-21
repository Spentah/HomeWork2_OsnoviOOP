package animals;

import java.util.Objects;

public class Giraffe extends Herbivore implements Run{
    private String nickname;
    private int animalSize = 150;



    @Override
    public String getNickname() {
        return nickname;
    }

    @Override
    public int getAnimalSize() {
        return animalSize;
    }

    public Giraffe(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void run() {
        System.out.println("Жираф бегает");
    }

    @Override
    public void treadOnTheGround() {
        System.out.println("Жираф топчется на месте");
    }

    @Override
    public void walkingStep() {
        System.out.println("Жираф идет прогулочным шагом");
    }

    @Override
    public String getName() {
        return "Жираф";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Giraffe giraffe = (Giraffe) o;
        return Objects.equals(nickname, giraffe.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }
}
