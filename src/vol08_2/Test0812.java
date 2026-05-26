package vol08_2;

public class Test0812 {
    /**
     * Syntax error, insert "... VariableDeclaratorId" to complete FormalParameterListJava(1610612976)
     */
    static void foo(void){
         System.out.print("A");
         }

    static void bar(short x) {
        foo();
        System.out.println("B");
    }

    public static void main(String[] args) {
        short s = 1;
        foo();
        bar(s);
    }
}
