import animals.Animal;
import animals.Carnivorous;
import animals.Herbivore;


import java.util.HashMap;
import java.util.Map;

public class Aviary<T extends Animal> {

    private Animal sample;

    public Aviary(AviarySize size) {
        this.size = size.getSize();
    }

    private int size;

    private Map<String, Animal> aviary = new HashMap<>();

    public void addAnimal(T animal) {
        if (size > animal.getAnimalSize()) {
            if (aviary.isEmpty()) {
                aviary.put(animal.getNickname(), animal);
                sample = animal;
                size -= animal.getAnimalSize();
                System.out.printf("Животное по кличке %s добавлено в вольер\n", animal.getNickname());
            } else if (((animal instanceof Carnivorous) && (sample instanceof Carnivorous)) ||
            (animal instanceof Herbivore) && (sample instanceof Herbivore)) {
                aviary.put(animal.getNickname(), animal);
                size -= animal.getAnimalSize();
                System.out.printf("Животное по кличке %s добавлено в вольер\n", animal.getNickname());
            } else System.out.println("Нельзя в один вольер садить хищников и травоядных!");
        } else System.out.println("В вольере не хватает места");
    }

    public void removeAnimal(String nickname) {
        size += aviary.get(nickname).getAnimalSize();
        aviary.remove(nickname);
        System.out.println("Зверь удален, текущий размер вольера " + size);
    }

    public Animal getAnimal(String nickname){
        System.out.println("Животное с такой кличкой - " + aviary.get(nickname).getName());
        return aviary.get(nickname);
    }
}
