package vol08_2;

public class SampleCall04 {
    static void printArray(int[] a) {
        for (int n : a) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int[] array = { 10, 20, 30 };

        printArray(array);
    }
}
