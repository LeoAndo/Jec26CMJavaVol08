public class Test0816 {
    static long foo(int x, int y, int v, int w) {
        // 値のコピーが渡ってくる.呼び出し元の変数名と同じである必要はない。
        // 順番だけ注意すれば良い。
        return x * y + v + w; // 5 = 1 * 0 + 2 + 3
    }

    public static void main(String[] args) {
        int x, y, v, w;
        x = 2;
        y = 3;
        v = 1;
        w = 0;
        System.out.print(foo(v, w, x, y)); // 5
    }
}
