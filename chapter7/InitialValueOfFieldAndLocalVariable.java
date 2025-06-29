package chapter7;

class B {
    boolean m1;
    int m2;
    double m3;
    String m4;
    void printFieldValue() {
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }

    void printLocalVariable() {
        int k;
        // System.out.println(k); // 지역 변수를 초기화 하지 않아 오류 발생
    }
}
public class InitialValueOfFieldAndLocalVariable {
    public static void main(String[] args) {
        B b = new B();
        b.printFieldValue();
    }
}
