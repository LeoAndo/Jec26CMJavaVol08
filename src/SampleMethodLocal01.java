public class SampleMethodLocal01 {
    static void foo() {
        int x = 100; //ここで生まれる
        // 変数xはこのコードブロック内でしか使えない.
    }

    public static void main(String[] args) {
        int x = 200; // 別物.
        foo();
        System.out.println(x); // command + bで宣言にジャンプして確認可能.
    }
}
