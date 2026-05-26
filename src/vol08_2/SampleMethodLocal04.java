package vol08_2;

public class SampleMethodLocal04 {
    static int foo(int x) {
        x = x * 10;
        System.out.println(x);
        return x;
    }

    public static void main(String[] args) {
        int x = 7;
        System.out.println(foo(x));
        System.out.println(x);
    }
}
