
class Pen {
    String color;
    String type;

    public void write(String color,String type){
        this.color = color;
        this.type = type;
    }

    void saySomething(){
        System.out.println("Hello, Pen is of "+color+" color of type "+ type);
    }
}

class Student {

    String name;
    int age;

    Student(){
        System.out.println("This is Non Parimaterized Constructor");
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void printData(){
        System.out.println("Student name is "+name+" and it's age is "+age);
    }

}

public class ObjectOriented {
    public static void main(String[] args) {
//        Pen p1 = new Pen();
//        p1.write("Red", "Gel");
//        p1.saySomething();
//
//        Pen p2 = new Pen();
//        p2.write("Black", "Ball");
//        p2.saySomething();

        Student s = new Student("Satyam", 21);
        s.printData();
    }
}
