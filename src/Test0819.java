public class Test0819 {
    static int foo1() {
        return 10;
    }

    static int foo2() {
        return -20;
    }

    public static void main(String[] args) {
        int x = 1, y = 2;
        // xはyよりも大きいですか？  Yesならfoo1()を実行する. Noならfoo2()を実行し、その処理結果を変数zに代入する.
//        int z = (x > y) ? foo1() : foo2();
        int z;
        if(x > y) {
            z = foo1();
        } else {
            z = foo2();
        }
        System.out.print(z); // -20
    }
}
