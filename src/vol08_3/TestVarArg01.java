package vol08_3;

public class TestVarArg01 {
    static void foo(int... x) {
        System.out.print("A");
    }

    public static void main(String[] args) {
        foo();
        foo(1);
        foo(1, 2);
        foo(1, 2, 3);
        foo(1, 2, 3, 4);
    }
}
