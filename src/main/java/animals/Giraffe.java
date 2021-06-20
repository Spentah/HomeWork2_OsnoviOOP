package animals;

public class Giraffe extends Herbivore implements Run{

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
        return "Рыба";
    }
}
