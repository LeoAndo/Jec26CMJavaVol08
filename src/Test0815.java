public class Test0815 {
    static void foo(int[] a) {
        a[1] = 100; // 同じインスタンスを見ている. 変更を加えている.
        // mainメソッドで宣言している int[] a変数が参照している
        // インスタンスの２つ目の要素の値を更新している.
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 }; // ここで配列のインスタンス化を行っている.
        foo(a);
        for (int i = 0; i < 4; i++) {
            System.out.print(a[i] + ":"); // 1:100:3:4:
        }
    }
}
