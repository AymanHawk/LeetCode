package Notes.OOPs.Polymorphism;

import javax.sql.XAConnection;

/*
* Polymorphism means many forms and it occurs when there are many classes that are related to each other by inheritance
* The method animalSound is being used to perform the different actions with the same name via METHOD OVERLOADING (can also be done using different argument for each call)
* */

class Animal {
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

class Cow extends Animal{
    public void animalSound(){
        System.out.println("The cow goes mooo mooo");
    }
}

class Cat extends Animal{
    public void animalSound(){
        System.out.println("The cat goes meowwww");
    }
}

class Main{
    public static void main(String[] args){
        Animal genericAnimal = new Animal();
        Cow cow = new Cow();
        Cat cat = new Cat();
        genericAnimal.animalSound();
        cow.animalSound();
        cat.animalSound();
    }
}