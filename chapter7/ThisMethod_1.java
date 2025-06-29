package chapter7;

class K {
    K() {
        System.out.println("첫 번째 생성자");
    }
    K(int a) {
        this();
        System.out.println("두 번째 생성자");
    }
    /*
    void abc() {
        this(); // 메서드에서는 this()메서드 사용 불가능
    }
     */
}
public class ThisMethod_1 {
    public static void main(String[] args) {
        K k1 = new K();
        System.out.println();
        K k2 = new K(3);
    }
}
