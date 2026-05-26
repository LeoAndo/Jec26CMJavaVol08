package vol08_2;

public class Test0819 {
    static int foo1() {
        return 10;
    }

    static int foo2() {
        return -20;
    }

    public static void main(String[] args) {
        int x = 1, y = 2;
        int z = (x > y) ? foo1() : foo2();
        System.out.print(z); // -20
    }
}
