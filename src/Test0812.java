public class Test0812 {
    /**
     * Syntax error, insert "... VariableDeclaratorId" to complete FormalParameterListJava(1610612976)
     * 引数にはvoidはかけない。これは戻り値無しの時に指定するもの.
     */
    static void foo() {
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
