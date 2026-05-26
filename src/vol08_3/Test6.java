package vol08_3;

public class Test6 {
    static void foo(String[] x) {
        System.out.println("A");
    }

    static void foo(String x) {
        System.out.println("B");
    }
    public static void main(String[] args) {
        String x = "XYZ";
        foo(x);
    }
}
