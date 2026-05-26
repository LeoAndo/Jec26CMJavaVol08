public class Test0806 {
    static int bar(int x) {
        // x は 1.
        return 2 + x; // 3 = 2 + 1;
    }

    static int foo() {
        int x = 1;
        int y;
        y = bar(x); // ++は後ろについている. この場合barメソッドの呼び出し後に+1される.
        x = x + 1;
        return y;
    }

    public static void main(String[] args) {
        int foo = foo();
        int bar = bar(1);
        System.out.println(foo + bar); // 6
    }
}
