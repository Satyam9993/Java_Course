
class A{

    static  int y = 10;
    static void say(){
        System.out.println(2222);
        //s();
        System.out.println(444);
    }

    void s(){
        System.out.println(1111);
    }
}
//class B extends A{
//    void say(){
//        System.out.println(2222);
//    }
//}
public class Test {

    public static void main(String[] args) {
        A a = new A();
        a.say();
    }
}
