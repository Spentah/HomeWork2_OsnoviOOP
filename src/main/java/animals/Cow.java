package animals;

public class Cow extends Herbivore implements Run, Voice{

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
}
