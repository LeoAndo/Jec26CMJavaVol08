package vol08_2;

public class SampleArg02 {
    static void meth(int x) {
        System.out.println(x);
    }

    // main メソッド
    public static void main(String[] args) {
        long l = 20L;
        meth((int) l);

        float f = 2.3F;
        meth((int) f);

        double d = 3.4;
        meth((int) d);
    }
}
