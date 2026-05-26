package vol08_3;

public class Test3 {
    static void foo(int x, int y) {
        System.out.println("A");
    }

    static void foo(int a, int b) {
        System.out.println("B");
    }

    public static void main(String[] args) {
        int v = 5, w = 10;
        foo(v, w);
    }
}
