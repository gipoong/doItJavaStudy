package chapter10.EX01_Typecasting_1;

class A {
    int m = 4;
    void printA() {
        System.out.println("A");
    }
}
class B extends A {
    int n = 5;
    void printB() {
        System.out.println("B");
    }
}
class C extends B {}
class D extends B {}
public class Typecasting_1 {
    public static void main(String[] args) {
        A a = new B();
        B bb = (B)a;

        bb.printA();
        bb.printB();
    }
}
