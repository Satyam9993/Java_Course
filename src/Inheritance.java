class Parent{
    void say(){
        System.out.println("I am Parent");
    }
}


class Child extends Parent{
    void say(){
        System.out.println("I am Child");
    }
}

class GrandChild extends Child{
    void say(){
        System.out.println("I am GrandChild");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Child c = new Child();
        GrandChild g = new GrandChild();
        Parent p = new Parent();
        p.say();
        c.say();
        g.say();
    }
}
