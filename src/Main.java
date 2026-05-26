public class Main {
    // 参照型
    public static class Person {
        public int age;
    }

    public static void main(String[] args) {
        System.out.println("参照型 配列の実験-START");
        int[] arrayInt = {10, 20, 30}; // インスタンス生成
        foo(arrayInt);
        System.out.println(arrayInt[0]);
        foo2(arrayInt);
        System.out.println(arrayInt[0]);

        System.out.println("基本データ型 intの実験-START");
        int a = 555;
        foo(a);
        System.out.println(a);

        System.out.println("参照型 Stringの実験-START");
        String aaa = "asasa"; // リテラルを使用してインスタンス生成
        foo(aaa);
        System.out.println(aaa);

        System.out.println("参照型 自分で作成したクラスの実験-START");
        Person person = new Person(); // インスタンス生成
        person.age = 21;
        foo(person);
        System.out.println(person.age);
        foo2(person);
        System.out.println(person.age);
    }

    private static void foo(String aaa) {
        aaa = "dasdasadsa"; // インスタンス生成
    }

    private static void foo(Person person) {
        person = new Person(); // インスタンス生成
        person.age = 999;
    }

    private static void foo2(Person person) {
        person.age = 999;
    }

    private static void foo(int a) {
        a = 444;
    }

    private static void foo(int[] abc) {
        abc = new int[]{100, 200, 300}; // インスタンス生成
    }

    private static void foo2(int[] abc) {
        abc[0] = 987;
    }
}