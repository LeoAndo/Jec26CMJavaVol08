public class Test0801 {
    static void foo(int x) { // 値のコピーが渡ってくる
        x *= 10; // 計算処理。影響範囲はメソッド内の変数xのみ
    }

    public static void main(String[] args) {
        int x = 1;
        foo(x);
        System.out.print(x); // 1
    }
}
