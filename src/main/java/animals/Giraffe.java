package animals;

public class Giraffe extends Herbivore implements Run{

    @Override
    public void run() {
        System.out.println("Жираф бегает");
    }

    @Override
    public String getName() {
        return "Рыба";
    }
}
