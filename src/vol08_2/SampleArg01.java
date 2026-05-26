package vol08_2;

public class SampleArg01 {
    static void meth(int x) {
        System.out.println(x);
    }

    // main メソッド
    public static void main(String[] args) {
        byte b = 10;
        meth(b);

        short s = 54;
        meth(s);

        int i = 400;
        meth(i);

        char c = 'A';
        meth(c);
    }
}
