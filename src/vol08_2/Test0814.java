package vol08_2;

public class Test0814 {
    static void foo(int[] a) {
        for (int x : a)
            System.out.println(x);
    }

    public static void main(String[] args) {
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++)
            a[i] = a[i] + 10;
        foo(a);
        // 10
        // 10
        // 10
    }
}
