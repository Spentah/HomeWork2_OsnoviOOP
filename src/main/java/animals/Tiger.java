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
    public String getName() {
        return "Тигр";
    }
}
