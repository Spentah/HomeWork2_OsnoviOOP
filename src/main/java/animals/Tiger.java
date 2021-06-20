package animals;

public class Tiger extends Carnivorous implements Run, Voice{

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
}
