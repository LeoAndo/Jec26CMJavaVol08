package vol08_2;

public class Test0805 {
    static void bar() {
        System.out.println("A");
    }

    static void foo() {
        bar();
        System.out.println("B");
    }

    public static void main(String[] args) {
        foo();
        bar();
        // A
        // B
        // A
    }
}
