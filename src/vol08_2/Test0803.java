package vol08_2;

public class Test0803 {
    static void foo(int x) {
        x = x * 100;
    }

    public static void main(String[] args) {
        int x = 12;
        foo(x);
        System.out.println(x); // 12
    }

}
