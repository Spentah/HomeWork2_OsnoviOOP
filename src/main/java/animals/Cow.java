package animals;

public class Cow extends Herbivore implements Run, Voice{

    @Override
    public void run() {
        System.out.println("Корова бегает");
    }

    @Override
    public String voice() {
        return "Mooooo";
    }

    @Override
    public String getName() {
        return "Корова";
    }
}
