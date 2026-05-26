package vol08_2;

public class SampleOverload01 {

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

    public static void main(String[] args) {
        int x = 12;
        int y = 3;
        int z = 4;

        System.out.println("x + y = " + add(x, y));

        System.out.println("x + y + z = " + add(x, y, z));

    }
}
