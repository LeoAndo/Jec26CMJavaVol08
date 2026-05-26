package vol08_3;

public class TestVarArg06 {
    static void foo(long x1, long x2) {
        System.out.println("foo(long, long)");
    }

    static void foo(long... x) {
        System.out.println("foo(long...)");
    }

    public static void main(String[] args) {
        foo(0L);
        foo(0L, 1L);
        foo(0L, 1L, 2L);
        foo(0L, 1L, 2L, 3L);
    }
}
