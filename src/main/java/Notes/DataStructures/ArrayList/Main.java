package Notes.DataStructures.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
    ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Benz");
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Tesla");
        System.out.println(cars);
        //can fetch element at specific index
        String index1 = cars.get(0);
        System.out.println(index1);
        //can modify element at specific index
        cars.set(0, "Bugatti");
        //can remove specified index
        cars.remove(0);
        System.out.println(cars.get(0));
        //can find size of list
        System.out.println(cars.size());
        //can remove all elements using clear
        cars.clear();
        System.out.println(cars);

        //loop through each element
        cars.add("Mustang");
        cars.add("Chevy");
        cars.add("Corvette");
        cars.add("GMC");
        cars.add("Ford");
        for (String i : cars){ //i must be String not Int because it will hold the value of the ArrayList in each index not just the number
            System.out.println(i);
        }
        //can sort list numerically or alphabetically
        System.out.println(cars);
        Collections.sort(cars);
        System.out.println("sorted: " + cars);
    }

}
