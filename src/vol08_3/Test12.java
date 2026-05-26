package vol08_3;

public class Test12 {
    static void foo(int x, short s) {
        System.out.println("foo(int, short)");
    }

    static void foo(int a, int b) {
        System.out.println("foo(int, int)");
    }
    public static void main(String[] args) {
        byte b1 = 10, b2 = 20;
        foo(b1, b2);
    }
}
