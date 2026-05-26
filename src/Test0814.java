public class Test0814 {
    static void foo(int[] a) {
        for (int x : a) {
            System.out.println(x); // 配列の要素の値を出力.
        }
    }

    public static void main(String[] args) {
        int[] a = new int[3];
        // TODO instance化. 初期値は全ての要素で0.
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + 10; // 10 = 0 + 10;
        }
        foo(a);
        // 10
        // 10
        // 10
    }
}
