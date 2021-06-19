package animals;

import java.sql.SQLOutput;

public class Bear extends Carnivorous implements Run, Voice{

    @Override
    public String voice() {
        return "Rrrarrr";
    }

    @Override
    public void run() {
        System.out.println("Медведь бегает");
    }

    @Override
    public String getName() {
        return "Медведь";
    }
}
