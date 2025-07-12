package chapter13.EX07_AnonymousClass_3;

interface A {
    void abc();
}

// 자식 클래스 직접 생성
class B implements A {
    public void abc() {
        System.out.println("입력 매개변수 전달");
    }
}

class C {
    void cde(A a) {
        a.abc();
    }
}
public class AnonymousClass_3 {
    public static void main(String[] args) {
        C c = new C();

        A a = new B();
        c.cde(a);

        c.cde(new B());
    }
}
