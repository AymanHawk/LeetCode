package Notes.OOPs.Abstraction;

/*
* Abstract classes provide a common definition of a base class that multiple derived classes can share
* */

public class Main {
    public static void main(String[] args){
        Pig pig = new Pig();
        pig.animalSound(); //abstract method defined
        pig.sleep();
    }
}
