package vol08_3;

public class TestVarArg04 {
    static void foo(int... x, int y) {
        System.out.print("A");
    }

    public static void main(String[] args) {
        foo(1, 2);
    }
}
