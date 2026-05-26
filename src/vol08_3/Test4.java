package vol08_3;

public class Test4 {
    static void foo(char x) {
        System.out.println("A");
    }

    static void foo(int x) {
        System.out.println("B");
    }

    static void foo(double x) {
        System.out.println("C");
    }
    public static void main(String[] args) {
        double d = 2.3D;
        foo((short) d);
    }
}
