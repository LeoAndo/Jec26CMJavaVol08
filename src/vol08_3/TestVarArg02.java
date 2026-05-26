package vol08_3;

public class TestVarArg02 {
    static void foo(int x, int... y) {
        System.out.println("A");
    }

    public static void main(String[] args) {
        foo();
        foo(1);
        foo(1, 2);
        foo(1, 2, 3);
        foo(1, 2, 3, 4);
    }
}
