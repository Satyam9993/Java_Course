abstract class Animal {

    Animal () {
        System.out.println("This is Animal");
    }
    abstract void walk();

    public void eats(){
        System.out.println("Animal Eats");
    }
}

class Horse extends Animal {

    Horse () {
        System.out.println("This is Horse");
    }
    public void walk(){
        System.out.println("Walks on 4 Legs");
    }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("Works on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eats();
    }
}
