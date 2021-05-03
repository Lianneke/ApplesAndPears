import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList <Fruit> al = new ArrayList<Fruit>();

        al.add(new Fruit("apple", 0.87));
        al.add(new Fruit("banana", 1.00));
        al.add(new Fruit("cherry", 0.15));

        Collections.sort(al);
        for(Fruit fruit : al){
            System.out.println(fruit.name + " "+ fruit.price);
        }



    }
}
