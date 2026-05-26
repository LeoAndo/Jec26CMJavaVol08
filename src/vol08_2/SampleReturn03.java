package vol08_2;

public class SampleReturn03 {
    static int[] foo1() {
        return null;
    }

    static String foo2() {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(foo1());
        System.out.println(foo2());
    }
}
