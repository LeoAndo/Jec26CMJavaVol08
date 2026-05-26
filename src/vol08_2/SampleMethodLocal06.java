package vol08_2;

public class SampleMethodLocal06 {
    static int[] foo() {
        int[] a = { 10, 20, 30 };

        return a;
    }

    public static void main(String[] args) {
        int[] b;
        b = foo();

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
