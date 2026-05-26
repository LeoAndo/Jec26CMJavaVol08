public class SampleOverload01 {
// overloadの実験.
    static int add(int v, int w) {
        System.out.println("2項足すメソッド:");
        int sum = v + w;
        return sum;
    }

    static int add(int v, int w, int u) {
        System.out.println("3項足すメソッド:");
        int sum = v + w + u;
        return sum;
    }
// Console Project. mainメソッドから始まる.
    public static void main(String[] args) {
        int x = 12;
        int y = 3;
        int z = 4;

        // option + returnキー
        System.out.println("x + y = " + add(x, y));

        System.out.println("x + y + z = " + add(x, y, z));
    }

    /*
     実行結果：
     2項足すメソッド:
     x + y = 15
     3項足すメソッド:
     x + y + z = 19
     */
}
