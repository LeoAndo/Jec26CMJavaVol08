package vol08_2;

public class SampleReturn01 {
    static int foo1() {
        int x = 1;
        return x;
    }

    static int foo2() {
        short x = 2;
        return x;
    }

    static int foo3() {
        byte x = 3;
        return x;
    }

    static int foo4() {
        char x = 'A';
        return x;
    }

    public static void main(String[] args) {
        System.out.println(foo1());
        System.out.println(foo2());
        System.out.println(foo3());
        System.out.println(foo4());
    }
}
