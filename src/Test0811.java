public class Test0811 {
    static void bar(float x) {
        // xは、floatの形に変換済み
        System.out.println(x);
    }

    public static void main(String[] args) {
        long x = 10;
        bar(x); // 10.0  拡大変換なので(float) xのようなキャスト処理は不要です
    }
}
