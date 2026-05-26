public class Test0807 {

    // TODO staticメソッドからの呼び出しがある場合は、staticをつけないとNG!
    static int bar(int x) {
        return 2 + x;
    }

    static int foo() {
        int x = 5;
        x = bar(x);
        return x;
    }

    public static void main(String[] args) {
        System.out.println(foo());
    }

}
