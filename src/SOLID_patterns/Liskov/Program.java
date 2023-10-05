package SOLID_patterns.Liskov;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Birds bird1 = new Birds(5);
        Birds bird2 = new Birds(6);
        Birds bird3 = new Birds(10);
        List<Birds> birds = new ArrayList<>();
        birds.add(bird1);
        birds.add(bird2);
        birds.add(bird3);
        processFly(birds);

    //класс может считаться подтипом класса, только если при подмене List<Birds> ничего не менятеся.

        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
    }

    public static  void processFly(List<Birds> birds){
        for(Birds bird: birds){
            bird.fly();
        }
    }
}
