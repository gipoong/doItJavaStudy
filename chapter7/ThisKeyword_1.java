package chapter7;

class H {
    int m;
    int n;
    void init(int a, int b) {
        int c;
        c = 3;
        this.m = a;
        this.n = b;
    }
    void work() {
        this.init(2, 3);
    }
}
public class ThisKeyword_1 {
    public static void main(String[] args) {
        H h = new H();
        h.work();
        System.out.println(h.m);
        System.out.println(h.n);
    }
}
