package vol08_3;

public class SampleVarArgOverride05 {
    static void foo(int... x) {
        System.out.println("foo(int...)の呼び出し");
    }

    static void foo(short x, short y) {
        System.out.println("foo(short, short)の呼び出し");
    }

    public static void main(String[] args) {
        short x = 10, y = 20, z = 30;

        foo();
        foo(x);
        foo(x, y);
        foo(x, y, z);
    }
}
