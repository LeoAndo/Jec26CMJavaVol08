package vol08_2;

public class SampleCall06 {
    static int[] createArray() {
        int[] a = { 10, 20, 30 };
        return a;
    }

    public static void main(String[] args) {
        int[] b;
        b = createArray();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
