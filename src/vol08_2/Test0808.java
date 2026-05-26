package vol08_2;

public class Test0808 {
    static int bar(int x) {
        return 2 * x;
    }

    static int foo(int x) {
        return x + 1;
    }

    public static void main(String[] args) {
        System.out.println(bar(foo(1))); // 4
    }
}
