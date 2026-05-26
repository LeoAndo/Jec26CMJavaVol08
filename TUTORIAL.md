# Java基礎_vol_08_-メソッド-

Java の **メソッド** を学ぶための授業用テキストです。

---

## 目次

1. [はじめに](#1-はじめに)
2. [メソッドの導入](#2-メソッドの導入)
3. [メソッドの呼び出し](#3-メソッドの呼び出し)
4. [引数](#4-引数)
5. [戻り値](#5-戻り値)
6. [ローカル変数とスコープ](#6-ローカル変数とスコープ)
7. [値渡しと参照渡し](#7-値渡しと参照渡し)
8. [オーバーロードとシグネチャ](#8-オーバーロードとシグネチャ)
9. [`main` メソッドとコマンドライン引数](#9-main-メソッドとコマンドライン引数)
10. [可変長引数](#10-可変長引数)
11. [演習問題](#11-演習問題)

---

## 1. はじめに

### 1.1 前提条件

- Vol01〜Vol07 までの内容（変数・型・演算子・制御構文・配列）を理解していること
- JDK 11 以上と IntelliJ IDEA がインストールされていること

### 1.2 学習目標

- メソッドを定義し、呼び出せるようになる
- 引数・戻り値・ローカル変数の関係を理解する
- 値渡しと参照渡しの違いを説明できる
- オーバーロードとシグネチャの概念を理解する
- `main` メソッドの正しい形と、コマンドライン引数の受け取り方を理解する
- 可変長引数（var-args）を使ったメソッドを定義できる

### 1.3 ソース構成

| ディレクトリ | 役割 |
|------------|------|
| `src/` 直下 | メソッドの導入、ローカル変数、確認問題、章番号付き演習 |
| `src/vol08_2/` | メソッド呼び出し・引数・戻り値・オーバーロードの基礎 |
| `src/vol08_3/` | `main` メソッド・可変長引数・オーバーロード解決 |

---

## 2. メソッドの導入

### 2.1 同じ処理の繰り返し（`SampleMethod01a`）

メソッドを使わずに同じ計算を書くと、コードが重複してしまいます。

```java
public class SampleMethod01a {
    public static void main(String[] args) {
        int price1 = 1200;
        int total1 = (int) (price1 + price1 * 0.1);
        System.out.println("税込価格 : " + total1 + "円");
        int price2 = 1000;
        int total2 = (int) (price2 + price2 * 0.1);
        System.out.println("税込価格 : " + total2 + "円");
    }
}
```

### 2.2 共通処理をメソッド化（`SampleMethod01b`）

税込価格を計算する処理を `calcTaxedPrice` メソッドに切り出します。

```java
public class SampleMethod01b {
    public static void main(String[] args) {
        int price1 = 1200;
        int total1 = calcTaxedPrice(price1);
        System.out.println("税込価格 : " + total1 + "円");

        int price2 = 1000;
        int total2 = calcTaxedPrice(price2);
        System.out.println("税込価格 : " + total2 + "円");
    }

    // 税込価格を計算するメソッド
    private static int calcTaxedPrice(int price) {
        int total = (int) (price + price * 0.1);
        return total;
    }
}
```

### 2.3 表示処理もメソッド化（`SampleMethod01c`）

```java
public class SampleMethod01c {
    public static void main(String[] args) {
        int price1 = 1200;
        showTaxedPrice(calcTaxedPrice(price1));

        int price2 = 1000;
        showTaxedPrice(calcTaxedPrice(price2));
    }

    private static void showTaxedPrice(int total) {
        System.out.println("税込価格 : " + total + "円");
    }

    private static int calcTaxedPrice(int price) {
        return (int) (price + price * 0.1);
    }
}
```

#### ポイント

| 要素 | 説明 |
|------|------|
| `private static` | アクセス修飾子＋クラスメソッドの宣言（`static` は Vol09 以降で詳説） |
| 戻り値の型 | `int` のように指定。戻り値が無い場合は `void` |
| メソッド名 | 動詞＋目的語（`calcTaxedPrice`, `showTaxedPrice` など）で命名すると読みやすい |
| 引数リスト | `(型 引数名, ...)` の形式 |
| `return` | 戻り値を返して呼び出し元に制御を戻す |

---

## 3. メソッドの呼び出し

### 3.1 戻り値あり（`vol08_2/SampleCall01`）

```java
static int add(int v, int w) {
    int sum = v + w;
    return sum;
}

public static void main(String[] args) {
    int x = 12;
    int y = 3;
    System.out.println("x + y = " + add(x, y));
}
```

### 3.2 戻り値なし（`vol08_2/SampleCall02`）

`void` を戻り値の型に指定すると `return` を書かなくてもよい（途中で抜けたい場合のみ `return;`）。

### 3.3 引数なし（`vol08_2/SampleCall03`）

```java
static void showMessage() {
    System.out.println("Hello!");
}
```

### 3.4 配列を渡す／返す（`SampleCall04` / `SampleCall06`）

配列は **参照** が渡されるため、メソッド内で要素を変更すると呼び出し元にも反映されます（`SampleCall05`）。

---

## 4. 引数

### 4.1 拡大変換（`vol08_2/SampleArg01`）

`byte` / `short` / `char` から `int` への暗黙の拡大変換は自動で行われます。

```java
static void meth(int x) {
    System.out.println(x);
}

public static void main(String[] args) {
    byte b = 10;
    meth(b);   // OK: byte → int に自動拡大
    short s = 54;
    meth(s);
    char c = 'A';
    meth(c);   // 'A' → 65
}
```

### 4.2 縮小変換（`vol08_2/SampleArg02`）

`long` / `float` / `double` を `int` パラメータに渡すには **明示的なキャスト** が必要です。

```java
double d = 3.4;
meth((int) d);  // キャストしないとコンパイルエラー
```

`SampleArg03` は「キャストを書かないとどうなるか」を実コードで確認するエラー例です。単体コンパイルすると、`double` から `int` へ暗黙に変換できないことを確認できます。

---

## 5. 戻り値

### 5.1 基本型を返す（`vol08_2/SampleReturn01`）

`byte` / `short` / `char` の値は、`int` を返すメソッドからそのまま返すことができます（暗黙の拡大変換）。

### 5.2 参照型を返す（`vol08_2/SampleReturn02`）

```java
static int[] foo1() {
    int[] a = { 10, 20, 30 };
    return a;
}

static String foo2() {
    String s = "ABC";
    return s;
}
```

`System.out.println(foo1())` をすると、配列の `toString()` 結果（`[I@xxxxxxx` 形式）が表示されます。

### 5.3 `null` を返す（`vol08_2/SampleReturn03`）

参照型を返すメソッドは `null` を返すこともできます。受け取った側で `null` チェックが必要です。

---

## 6. ローカル変数とスコープ

### 6.1 メソッドごとに別の変数

`SampleMethodLocal01`（`src/` 直下）:

```java
static void foo() {
    int x = 100; // foo の中だけで使える
}

public static void main(String[] args) {
    int x = 200; // main の中だけで使える（foo の x とは別物）
    foo();
    System.out.println(x); // 200
}
```

`vol08_2/SampleMethodLocal01` は対照用のエラー例です。`foo` の中で宣言した `x` を `main` から直接参照しており、ローカル変数のスコープ外参照としてコンパイルエラーになります。

### 6.2 引数も「ローカル変数」（`vol08_2/SampleMethodLocal03`）

引数として渡された変数の値を書き換えても、呼び出し元には影響しません（基本型の場合）。

### 6.3 配列を引数で受け取る／返す

- `SampleMethodLocal05` : 配列を引数で受け取り、要素を表示
- `SampleMethodLocal06` : 配列を生成して戻り値で返す

---

## 7. 値渡しと参照渡し

`Main.java` は、基本型（`int`）と参照型（`String` / 配列 / 自作クラス）の両方で「引数として渡したインスタンスはメソッド内でどう扱われるか」を実験しているコードです。

要点:

- **基本型**: 値のコピーが渡るため、メソッド内の代入は呼び出し元に影響しない。
- **参照型**: 参照（インスタンスを指す矢印）のコピーが渡る。
  - メソッド内で **同じインスタンスの中身を書き換える** → 呼び出し元にも反映される。
  - メソッド内で **引数変数に別のインスタンスを代入する** → 呼び出し元には影響しない。

---

## 8. オーバーロードとシグネチャ

### 8.1 オーバーロードの基本（`SampleOverload01`, `vol08_2/SampleOverload01`）

同じメソッド名でも、**引数の型または個数** が違えば複数定義できます。

```java
static int add(int v, int w)         { return v + w; }
static int add(int v, int w, int u)  { return v + w + u; }
```

### 8.2 シグネチャ（`SignatureSample01`）

メソッドシグネチャ = **メソッド名 + 引数リスト（型と順序）**。
**戻り値の型はシグネチャに含まれません**。`vol08_2/SampleOverload02` が実コードで示すとおり、引数名だけ違うものは「重複」とみなされコンパイルエラーになります。

### 8.3 呼び出し時の解決（`vol08_3/SampleCallOverload01`）

```java
static void meth(int i)    { System.out.println("meth(int)"); }
static void meth(double d) { System.out.println("meth(double)"); }
```

- `byte` / `short` / `char` → `int` 側に拡大変換されて呼ばれる
- `long` / `float` / `double` → `double` 側に拡大変換されて呼ばれる

---

## 9. `main` メソッドとコマンドライン引数

### 9.1 正しい `main`（`vol08_3/SampleMainMethod01`）

```java
public static void main(String[] args) { ... }
```

修飾子 (`public static`)・戻り値型 (`void`)・メソッド名 (`main`)・引数 (`String[]`) のすべてが揃わないと、JVM のエントリポイントとして認識されません。

- `SampleMainMethod02` : `public` が無い → 起動不可
- `SampleMainMethod03` : `static` が無い → 起動不可
- `SampleMainMethod04` : 戻り値が `int` → 起動不可
- `SampleMainMethod05` / `06` : `main(int)` や `main()` は **オーバーロードとして** 定義可能だが、JVM が呼ぶのは `main(String[])` のみ

### 9.2 コマンドライン引数（`vol08_3/SampleCommArgs`）

```java
public static void main(String[] args) {
    System.out.println("args[0] = " + args[0]);
}
```

実行時に渡した文字列が `args` 配列に格納されます。

```bash
java -cp out vol08_3.SampleCommArgs Hello
# args[0] = Hello
```

---

## 10. 可変長引数

### 10.1 基本（`vol08_3/SampleVarArg01`〜`04`）

```java
static void foo(int... x) {
    System.out.println("受け取った個数 = " + x.length);
}
```

- `foo()` / `foo(1)` / `foo(1,2,3)` のように **任意の個数の引数** を渡せる
- メソッド内では `int[]` として扱える

### 10.2 制約

- 可変長引数は **必ず引数リストの最後** に置く
- 1 メソッドに **可変長引数は 1 つだけ**
- `static void foo(int... x, int y)` や `static void foo(int... x, int... y)` はコンパイルエラー
  （`TestVarArg03`, `TestVarArg04` が実コードで例示）

### 10.3 オーバーロードとの組み合わせ（`SampleVarArgOverride03`〜`05`）

- 通常の引数の方が **可変長引数よりも優先** される
- `foo(int x)` と `foo(int... x)` が両方ある場合、`foo(12)` は `foo(int x)` 側が呼ばれる（`TestVarArg08`）

### 10.4 `main` も可変長引数で書ける（`SampleVarArg05`, `TestVarArg10`）

```java
public static void main(String... args) { ... }
```

`String[] args` と等価です。

---

## 11. 演習問題

実際の演習問題は以下のファイルにあります。多くのファイルは独立して実行できますが、コンパイルエラー確認用のファイルは 1 ファイルずつ `javac` で確認します。

| ファイル群 | 内容 |
|----------|------|
| `src/Test0801.java` 〜 `Test0819.java` | 章番号付きの演習（メソッド全般） |
| `src/vol08_2/Test0801.java` 〜 `Test0819.java` | パッケージ版の同等演習 |
| `src/vol08_3/Test1.java` 〜 `Test13.java` | オーバーロード解決の演習 |
| `src/vol08_3/TestMain01.java` 〜 `TestMain08.java` | `main` メソッドの演習 |
| `src/vol08_3/TestVarArg01.java` 〜 `TestVarArg10.java` | 可変長引数の演習 |
| `src/Kakunin01.java` | 識別子・予約語・修飾子の確認問題 |

### コンパイルエラー確認用サンプル

以下のファイルは、コメントアウトせずにエラー箇所を実コードとして残しています。コンパイルエラーの内容と確認手順は `FLOWCHARTS_AND_TRACES.md` にまとめています。

| ファイル | 確認する内容 |
|----------|--------------|
| `src/Kakunin01.java` | 数字始まり、予約語、不正文字はメソッド名に使えない |
| `src/Test0818.java` | 必要な引数を渡さない呼び出しはできない |
| `src/vol08_2/SampleArg03.java` | `double` を `int` 引数へ暗黙に渡せない |
| `src/vol08_2/SampleMethodLocal01.java` | ローカル変数は宣言されたメソッドの外から参照できない |
| `src/vol08_2/SampleOverload02.java` | 引数名だけ違うメソッドはオーバーロードにならない |
| `src/vol08_2/Test0807.java` | `static` メソッドからインスタンスメソッドを直接呼べない |
| `src/vol08_2/Test0810.java` | `int` を `char` 引数へ暗黙に渡せない |
| `src/vol08_2/Test0812.java` | Java では引数なしを `(void)` と書かない |
| `src/vol08_2/Test0818.java` | 必要な引数を渡さない呼び出しはできない |
| `src/vol08_3/SampleCallOverload02.java` | `int` は `short` へ暗黙に縮小変換されない |
| `src/vol08_3/SampleCallOverload03.java` | 複数のオーバーロード候補が同程度に一致して曖昧になる |
| `src/vol08_3/SampleStaticMethod01.java` | `static` な `main` からインスタンスメソッドを直接呼べない |
| `src/vol08_3/SampleVarArg02.java` | 可変長引数の前にある通常引数は省略できない |
| `src/vol08_3/SampleVarArgOverride01.java` | 同じ可変長引数シグネチャは重複になる |
| `src/vol08_3/SampleVarArgOverride02.java` | `int...` と `int[]` は同時に宣言できない |
| `src/vol08_3/Test10.java` | 引数名だけ違う `add(int, int)` は重複になる |
| `src/vol08_3/Test13.java` | `short[]` は `int[]` / `byte[]` へ変換できない |
| `src/vol08_3/Test3.java` | 引数名だけ違っても同じシグネチャになる |
| `src/vol08_3/Test5.java` | `byte[]` は `int[]` / `float[]` へ変換できない |
| `src/vol08_3/Test9.java` | 戻り値型や修飾子だけではオーバーロードできない |
| `src/vol08_3/TestVarArg02.java` | 可変長引数の前にある通常引数は省略できない |
| `src/vol08_3/TestVarArg03.java` | 可変長引数を複数置くことはできない |
| `src/vol08_3/TestVarArg04.java` | 可変長引数の後ろに通常引数は置けない |
| `src/vol08_3/TestVarArg09.java` | `int[]` と `int...` は同時に宣言できない |

### 演習の進め方

1. 各ファイルを開き、**実行する前に出力を予想** する
2. 実行して結果を確認する
3. コンパイルエラー確認用のファイルは「なぜコンパイルできないか」を考える

### 例: `Test0801` の出力を予想してみよう

```java
public class Test0801 {
    static void foo(int x) {
        x *= 10;
    }

    public static void main(String[] args) {
        int x = 1;
        foo(x);
        System.out.print(x); // ?
    }
}
```

<details>
<summary>解答</summary>

`1`。`foo` 内の `x` は引数として渡された値のコピーであり、`main` の `x` とは別の変数。`*= 10` しても呼び出し元には影響しない。

</details>

---

## まとめ

このテキストでは以下を学びました:

- **メソッドの定義と呼び出し** — 共通処理をまとめて再利用する
- **引数と戻り値** — 拡大変換は暗黙、縮小変換は明示キャスト
- **ローカル変数とスコープ** — メソッド境界をまたいで変数は共有されない
- **値渡しと参照渡し** — 基本型は値のコピー、参照型は参照のコピー
- **オーバーロードとシグネチャ** — 戻り値型はシグネチャに含まれない
- **`main` メソッド** — JVM が起動するための厳密な形
- **可変長引数** — `型... 名` で任意個数の引数を受け取る

次のステップとして、クラスとインスタンスの作成（Vol09 以降）に進みましょう。
