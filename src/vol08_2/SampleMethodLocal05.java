package vol08_2;

public class SampleMethodLocal05 {
    static void foo(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = { 11, 22, 33 };
        foo(a);
    }
}
