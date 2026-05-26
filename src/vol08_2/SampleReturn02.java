package vol08_2;

public class SampleReturn02 {
    static int[] foo1() {
        int[] a = { 10, 20, 30 };
        return a;
    }

    static String foo2() {
        String s = "ABC";
        return s;
    }

    public static void main(String[] args) {
        System.out.println(foo1());
        System.out.println(foo2());
    }
}
