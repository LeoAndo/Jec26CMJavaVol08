public class Test0804 {
    static int bar(int x) {
        return x * 2; // 240 = 120 * 2
    }

    static int foo(int x) {
        // xに12が渡ってくる.
        x = x * 10; // 計算処理。影響範囲はメソッド内の変数xのみ  120 = 12 * 10;
        return bar(x); //別のメソッドを呼び出してその処理結果を戻り値として返す.
    }

    public static void main(String[] args) {
        int x = 12;
        foo(x); // foo(12);
        System.out.println(foo(x)); // foo(12);
    }
}
