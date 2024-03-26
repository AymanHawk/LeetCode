package Notes.OOPs.Encapsulation;

public class Person {

/*
* Encapsulation means to make sure "sensitive" data is hidden from users which is done
* via the private modifier -> we are then able to manipulate these variables with
* getters and setters
* */

    private String name;
    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public static void main(String[] args){
        Person dummy = new Person();
//      dummy.name cannot be access outside this class
        dummy.setName("Ayman");
        System.out.println(dummy.getName());

    }

}
