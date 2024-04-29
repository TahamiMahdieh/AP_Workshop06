import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Parrot("Brazilian parrot", 5, "can speak", 50));
        animals.add(new Parrot("green parrot", 8, "eats nuts", 40));
        animals.add(new Eagle("Asian eagle", 8, "eagle vision", 800));
        animals.add(new Cheetah("cheetah", 12, "fastest animal", 100));
        animals.add(new Giraffe("giraffe", 3, "tallest animal", 30));

        for (Animal a : animals)
            a.show();
        Cheetah c = new Cheetah("cheeta", 7, "fastest", 100);
        c.hunt((Parrot)animals.get(0));
    }
}