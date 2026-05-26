package vol08_3;

public class Test7 {
    static void foo(int[] x) {
        System.out.println("A");
    }

    static void foo(int x) {
        System.out.println("B");
    }

    static void foo(int x, int y) {
        System.out.println("C");
    }

    public static void main(String[] args) {
        int[] x = {10, 20, 30};
        foo(x[1], x[2]);
    }
}
