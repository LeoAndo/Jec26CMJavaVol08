package vol08_2;

public class Test0804 {
    static int bar(int x) {
        return x * 2;
    }

    static int foo(int x) {
        x = x * 10;
        return bar(x);
    }

    public static void main(String[] args) {
        int x = 12;
        foo(x);
        System.out.println(foo(x));
    }
}
