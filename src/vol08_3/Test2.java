package vol08_3;

public class Test2 {
    static void foo(long x) {
        System.out.println("A");
    }

    static void foo(float x) {
        System.out.println("B");
    }

    public static void main(String[] args) {
        int x = 5;
        foo(x);
    }
}
