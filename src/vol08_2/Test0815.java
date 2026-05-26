package vol08_2;

public class Test0815 {
    static void foo(int[] a) {
        a[1] = 100;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        foo(a);
        for (int i = 0; i < 4; i++) {
            System.out.print(a[i] + ":"); // 1:100:3:4:
        }
    }
}
