package chapter7;

class I {
    int m;
    int n;
    void init(int m, int n) {
        m = m;
        n = n;
    }
}

class J {
    int m;
    int n;
    void init(int m, int n) {
        this.m = m;
        this.n = n;
    }
}
public class ThisKeyworkd_2 {
    public static void main(String[] args) {
        I i = new I();
        i.init(2, 3);
        System.out.println(i.m);
        System.out.println(i.n);

        J j = new J();
        j.init(2, 3);
        System.out.println(j.m);
        System.out.println(j.n);
    }
}
