package animals;

public class Duck extends Herbivore implements Fly,Voice,Swim{

    @Override
    public String voice() {
        return "Quack";
    }

    @Override
    public void fly() {
        System.out.println("Утка летает");
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }

    @Override
    public String getName() {
        return "Утка";
    }
}
