package vol08_2;

public class Test0813 {
    static byte foo() {
        byte b = 1;
        b += 1;
        return b;
    }

    public static void main(String[] args) {
        System.out.print(foo());// 2
    }
}
