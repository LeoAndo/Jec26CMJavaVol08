public class SignatureSample01 {
    public static void main(String[] args) {
        int ret = foo(1, 2, 3);
        int ret2 = foo(1, 2, 3, 4);
    }

    private static int foo(int i, int j, int k, int l) {
        return 0;
    }

    private static int foo(int i, int j, int k) {
        return 0;
    }
}
