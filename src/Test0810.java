public class Test0810 {
    static int bar(char x) {
        // xに65が渡ってくる.
        return x;
    }

    public static void main(String[] args) {
        int x = 65;
        /**
         * The method bar(char) in the type Test0810 is not applicable for the arguments
         * (int)Java(67108979)
         */
        x = bar((char)x);
        // TODO 縮小変換 小さい型へ変換する場合は、 (char)x このように書かないとダメ。
        System.out.println(x);
    }
}
