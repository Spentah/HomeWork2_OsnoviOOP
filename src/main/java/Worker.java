import animals.Animal;
import animals.Voice;
import animals.WrongFoodException;
import food.Food;

public class Worker {

    public void feed(Food food, Animal animal) {
        try {
            animal.eat(food);
        } catch (WrongFoodException e) {
            System.out.println(e.getMessage());
        }

    }

    public void getVoice(Voice voice) {
        System.out.println(voice.voice());
    }
}
