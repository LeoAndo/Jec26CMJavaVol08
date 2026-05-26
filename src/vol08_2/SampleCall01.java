package vol08_2;

public class SampleCall01 {
    static int add(int v, int w) {
        int sum = v + w;
        return sum;
    }

    public static void main(String[] args) {
        int x = 12;
        int y = 3;

        System.out.println("x + y = " + add(x, y));
    }
}
