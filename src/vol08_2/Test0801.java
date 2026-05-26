package vol08_2;

public class Test0801 {
    static void foo(int x) {
        x *= 10;
    }

    public static void main(String[] args) {
        int x = 1;
        foo(x);
        System.out.print(x); // 1
    }
}
