public class Test0803 {
    static void foo(int x) { // 値のコピーが渡ってくる
        x = x * 100; // 計算処理。影響範囲はメソッド内の変数xのみ
    }

    public static void main(String[] args) {
        int x = 12;
        foo(x);
        System.out.println(x); // 12 mainメソッド内で宣言している変数xを見ている.
    }

}
