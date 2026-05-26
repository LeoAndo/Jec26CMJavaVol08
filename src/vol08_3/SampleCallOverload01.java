package vol08_3;

public class SampleCallOverload01 {
    static void meth(int i) {
        System.out.println("meth(int)が呼び出されました。");
    }

    static void meth(double d) {
        System.out.println("meth(double)が呼び出されました。");
    }

    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 2.3f;
        double d = 2.3;
        char c = 'A';
        meth(b);
        meth(s);
        meth(i);
        meth(l);
        meth(f);
        meth(d);
        meth(c);
    }
}