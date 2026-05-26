package vol08_2;

public class Test0806 {
    static int bar(int x) {
        return 2 + x;
    }

    static int foo() {
        int x = 1;
        int y;
        y = bar(x++);
        return y;
    }

    public static void main(String[] args) {
        System.out.println(foo() + bar(1)); // 6
    }
}
