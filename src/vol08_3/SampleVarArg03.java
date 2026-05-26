package vol08_3;

public class SampleVarArg03 {
    static void foo(int... x) {
        System.out.println("var-arg で受け取った引数の数 =" + x.length);
    }

    public static void main(String[] args) {
        int x = 10, y = 20, z = 30;
        foo();
        foo(x);
        foo(x, y);
        foo(x, y, z);
    }
}
