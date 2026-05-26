public class Test0817 {
    static void foo() {
        int x = 0;
        System.out.println(x);
        // return; // 省略可能
        // voidの場合、returnを書かなくても良い。
    }

    public static void main(String[] args) {
        // 0
        // 0
        // 0
        for (int i = 0; i < 3; i++) {
            foo();
        }
    }
}
