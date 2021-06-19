package animals;

public class Fish extends Carnivorous implements Swim{
    @Override
    public void swim() {
        System.out.println("Рыба плавает");
    }


    @Override
    public String getName() {
        return "Рыба";
    }
}
