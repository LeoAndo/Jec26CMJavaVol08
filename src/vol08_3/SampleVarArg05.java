package vol08_3;

public class SampleVarArg05 {
    public static void main(String... args) {
        for (String a : args) {
            System.out.println(a);
        }
    }
}
