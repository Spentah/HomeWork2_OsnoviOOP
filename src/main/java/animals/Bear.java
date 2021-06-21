package animals;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Bear extends Carnivorous implements Run, Voice{

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

    public Bear(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String voice() {
        return "Rrrarrr";
    }

    @Override
    public void run() {
        System.out.println("Медведь бегает");
    }

    @Override
    public void walkingStep() {
        System.out.println("Медведь прогуливается");
    }

    @Override
    public void treadOnTheGround() {
        System.out.println("Медведь топчется на месте");
    }

    @Override
    public String getName() {
        return "Медведь";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bear bear = (Bear) o;
        return Objects.equals(nickname, bear.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nickname);
    }
}
