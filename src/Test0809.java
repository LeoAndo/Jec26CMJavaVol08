public class Test0809 {
    static double bar(int x) {
        return x; // 戻り値doubleなので拡大変換されて、7.0
    }

    public static void main(String[] args) {
        double d = bar(7); // intのリテラル 7
        System.out.println(d); // 7.0
    }
}
