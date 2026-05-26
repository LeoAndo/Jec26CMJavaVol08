package vol08_3;

public class Test1 {
    static void foo(float x) {
        System.out.println("A");
    }

    static void foo(short x) {
        System.out.println("B");
    }
    public static void main(String[] args) {
        byte b = 5;
        foo(b);
    }
}
