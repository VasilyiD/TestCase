package FruitsTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List fruits = new ArrayList<>();
        fruits.addAll(Arrays.asList(new Apple(), new Apple(), new Apple(), new Pear(), new Pear(), new Orange()));


        int apples = 0;
        int pears = 0;
        int oranges = 0;

        for (Object e : fruits) {
            if (e instanceof Apple) {
                apples++;
            } else if (e instanceof  Pear) {
                pears++;
            } else if (e instanceof  Orange) {
                oranges++;
            }
        }

        System.out.println(String.format("Всего в наличии %d фруктов \n" +
                "из них: Яблоки %dшт., Груши %dшт., Апельсины %dшт.",fruits.size(),apples,pears,oranges));

    }
}