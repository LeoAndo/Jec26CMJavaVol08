package vol08_2;

public class SampleMethodLocal03 {
    static void foo(int x) {
        x = x * 10;
    }

    public static void main(String[] args) {
        int x = 12;
        foo(x);
        System.out.println(x);
    }
}
