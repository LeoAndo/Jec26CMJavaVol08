package vol08_3;

public class TestVarArg08 {
    static void foo(int x) {
        System.out.println("foo(int x)");
    }

    static void foo(int... x) {
        System.out.println("foo(int... x)");
    }

    public static void main(String[] args) {
        foo(12);
    }
}
