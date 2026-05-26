public class Test0808 {
    static int bar(int x) {
       // xには2が渡ってくる.
        return 2 * x; //4 = 2 * 2;
    }

    static int foo(int x) {
        // xには1が渡ってくる.
        return x + 1; // 2 = 1 + 1;
    }

    public static void main(String[] args) {
        // この問題はメソッドの処理結果を一度変数に代入するなどして分解したほうが良い。
        // 非常にわかりにくいプログラムのため。
        int foo = foo(1);
        int bar = bar(foo);
        System.out.println(bar); // 4
    }
}
