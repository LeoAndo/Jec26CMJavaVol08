public class SampleReturn02 {
    static int[] foo1() {
        int[] a = { 10, 20, 30 };
        return a;
    }

    static String foo2() {
        String s = "ABC"; //instance
        return s;
    }

    public static void main(String[] args) {
        // TODO hashCode()を使うとインスタンスに割り振られたIDを確認することができる.
        // TODO swiftでメソッド呼び出しの時に、引数名を各パターンOKだが、Javaはできない.
//        System.out.println(foo1().hashCode());
//        System.out.println(foo2());
//        System.out.println(foo1().hashCode());
//        System.out.println(foo2().hashCode());

        System.out.println("「確認問題：メソッドの呼び出し」を行う時間とします。問題数は19問。");
        System.out.println("足並み揃ったあたりで、解説を行います");
    }
}
