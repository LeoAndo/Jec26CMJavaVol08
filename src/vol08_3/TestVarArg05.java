package vol08_3;

public class TestVarArg05 {
    static void foo(int... x) {
        System.out.print("A");
    }

    public static void main(String[] args) {
        short s = 10;
        foo(s);
    }
}
