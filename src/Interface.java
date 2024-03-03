interface Animal1 {
    public void walk();
    public void eat();
//    Does not allow fn
//    void eat(){};
}

interface Herbivore {

}
class Horse1 implements Animal1, Herbivore {
    public void walk(){
        System.out.println();
    }

    public void eat(){
        System.out.println();
    }
}



public class Interface {
    public static void main(String[] args) {

    }
}
