package chapter7;

class D {
    int m;
    void work() {
        System.out.println(m);
    }
}

class E {
    int m;
    void work() {
        System.out.println(m);
    }
    E() {
         // 기본 생성자를 직접 정의
    }
}

class F {
    int m;
    void work() {
        System.out.println(m);
    }
    F(int a) {
        m = a;
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
        D d = new D();
        E e = new E();
//        F f = new F();
        F f = new F(3);

        d.work();
        e.work();
        f.work();
    }
}
