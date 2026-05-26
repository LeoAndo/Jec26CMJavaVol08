package vol08_3;

public class Test8 {
    static void foo(int x) {
        System.out.println("A");
    }

    static void foo(int x, int y) {
        System.out.println("B");
    }

    static void foo(int x, int y, int z) {
        System.out.println("C");
    }
    public static void main(String[] args) {
        byte b = 10;
        int i = 10;
        foo(i, i);
        foo(b);
    }
}
