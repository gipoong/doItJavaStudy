package chapter9;

import chapter9.pack1.A;
import chapter9.pack1.B;
import chapter9.pack2.C;
import chapter9.pack2.D;

public class AccessModifierOfMember {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.print();
        b.print();
        c.print();
        d.print();
    }
}
