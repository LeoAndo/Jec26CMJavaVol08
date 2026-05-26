public class Test0802 {
    static void foo() {
        int x = 777; // mainメソッドで定義している変数xと別物.
        System.out.println(x); // 777
    }

    public static void main(String[] args) {
        int x = 100; // text color gray
        foo();
    }
}
