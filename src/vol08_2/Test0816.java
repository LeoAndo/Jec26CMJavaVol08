package vol08_2;

public class Test0816 {
    static long foo(int x, int y, int v, int w) {
        return x * y + v + w;
    }

    public static void main(String[] args) {
        int x, y, v, w;
        x = 2;
        y = 3;
        v = 1;
        w = 0;
        System.out.print(foo(v, w, x, y)); // 5
    }
}
