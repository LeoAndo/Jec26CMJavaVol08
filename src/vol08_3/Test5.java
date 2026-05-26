package vol08_3;

public class Test5 {
    static void foo(int[] x) {
        System.out.println("A");
    }

    static void foo(float[] x) {
        System.out.println("B");
    }

    public static void main(String[] args) {
        byte[] x = new byte[10];
        foo(x);
    }
}
