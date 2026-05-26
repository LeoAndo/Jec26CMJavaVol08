public class SampleMethodLocal06 {
    static int[] foo() {
        int[] a = { 10, 20, 30 };// instance

        return a; // この結果をbに代入.
    }

    public static void main(String[] args) {
        int[] b;
        b = foo();

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]); // 配列の各要素の値を標準出力
        }
    }
}
