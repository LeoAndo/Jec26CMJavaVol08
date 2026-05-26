package vol08_2;

public class SampleCall02 {
    static void add(int v, int w) {
        int sum = v + w;
        System.out.println("x + y = " + sum);
    }

    public static void main(String[] args) {
        int x = 12;
        int y = 3;

        // メソッドの呼び出し
        add(x, y);
    }
}
