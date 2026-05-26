package vol08_3;

public class TestMain04 {
    public static void main(String args) {
        System.out.print(args);
    }

    public static void main(String[] args) {
        main("A");
        System.out.print("B");
    }
}
