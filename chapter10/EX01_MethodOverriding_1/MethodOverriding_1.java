package chapter10.EX01_MethodOverriding_1;

class A {
    void print() {
        System.out.println("A 클래스");
    }
}

class B extends A {
    @Override
    void print() {
        System.out.println("B 클래스");
    }
}
public class MethodOverriding_1 {
    public static void main(String[] args) {
        A aa = new A();
        aa.print(); // A 클래스

        B bb = new B();
        bb.print(); // B 클래스

        A ab = new B();
        ab.print(); // B 클래스
    }
}
