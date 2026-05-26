package vol08_2;

public class Test0818 {
    static void foo(short s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        /**
         * The method foo(short) in the type Test0818 is not applicable for the
         * arguments ()Java(67108979)
         */
        foo();
    }
}
