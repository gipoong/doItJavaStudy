package chapter7;

class L {
    int m1, m2, m3, m4;
    L() {
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }
    L(int a) {
        m1 = a;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }
    L(int a, int b) {
        m1 = a;
        m2 = b;
        m3 = 3;
        m4 = 4;
    }
    void print() {
        System.out.print(m1 + " ");
        System.out.print(m2 + " ");
        System.out.print(m3 + " ");
        System.out.print(m4);
        System.out.println();
    }
}

class M {
    int m1, m2, m3, m4;
    M() {
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }
    M(int a) {
        this();
        m1 = a;
    }
    M(int a, int b) {
        this(a);
        m2 = b;
    }
    void print() {
        System.out.print(m1 + " ");
        System.out.print(m2 + " ");
        System.out.print(m3 + " ");
        System.out.print(m4);
        System.out.println();
    }
}
public class ThisMethod_2 {
    public static void main(String[] args) {
        L l1 = new L();
        L l2 = new L(10);
        L l3 = new L(10, 20);
        l1.print();
        l2.print();
        l3.print();
        System.out.println();


        M m1 = new M();
        M m2 = new M(10);
        M m3 = new M(10, 20);
        m1.print();
        m2.print();
        m3.print();
    }
}
