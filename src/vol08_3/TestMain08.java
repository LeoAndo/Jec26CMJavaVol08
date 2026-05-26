package vol08_3;

public class TestMain08 {
    public static void main(String args1, String args2) {
        System.out.print(args1 + args2);
    }

    public static void main(String[] args) {
        main(args[0]);
    }

    private static void main(String args) {
        main(args, "X");
    }
}
