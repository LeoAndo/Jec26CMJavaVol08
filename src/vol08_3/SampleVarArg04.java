package vol08_3;

public class SampleVarArg04 {
    static void foo(int... x) {
        for (int i : x) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int x = 10, y = 20, z = 30;
        foo();
        foo(x);
        foo(x, y);
        foo(x, y, z);
    }
}
