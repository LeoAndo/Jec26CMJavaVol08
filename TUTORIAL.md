# Java基礎_vol_01_-Javaプログラミングの基本-

Javaを学ぶための授業用テキストです。

---

## 目次

1. [はじめに](#1-はじめに)
2. [プロジェクト構成](#2-プロジェクト構成)
3. [演習問題](#3-演習問題)

---

## 1. はじめに

### 1.1 前提条件

このテキストは以下の知識・環境を持つ学生を対象としています。

**必要な知識:**
- プログラミングの経験は不要

**必要な環境:**
- JDK 11 以上がインストールされていること
- IntelliJ IDEA（Community Edition 可）がインストールされていること

### 1.2 このテキストの目的

このテキストでは、Java プログラミングの最も基本的な部分を学びます。
「Hello, World!」を表示するプログラムを題材に、Java プログラムの構造と実行方法を理解しましょう。

### 1.3 開発環境

| 項目 | バージョン |
|------|-----------|
| JDK | 11 以上 |
| IDE | IntelliJ IDEA |

### 1.4 学習目標

- Java プログラムの基本構造を理解する
- `main` メソッドの役割を理解する
- `System.out.println` で文字列を出力できるようになる
- IntelliJ IDEA でプログラムをコンパイル・実行できるようになる

---

## 2. プロジェクト構成

### 2.1 ディレクトリ構造

```
JecJavaTemplate/
└── src/
    ├── Main.java           # Hello World（エントリーポイント）
    ├── Sample01.java       # サンプルコード 01
    ├── Sample02.java       # サンプルコード 02
    ├── Literal03a.java     # リテラル解説 03a
    ├── Literal03b.java     # リテラル解説 03b
    └── Ex0101.java         # 演習問題 01-01
```

### 2.2 主要ファイルの役割

各ファイルは `public static void main(String[] args)` を持つ独立したプログラムです。

| ファイル | 内容 |
|---------|------|
| `Main.java` | 「Hello, World!」を表示する最初のプログラム |
| `Sample01.java` | 文字列出力のサンプル |
| `Sample02.java` | 文字列出力のサンプル |
| `Literal03a.java` | 文字リテラル（`char`）とエスケープシーケンスの解説 |
| `Literal03b.java` | 文字リテラルと Unicode エスケープの解説 |
| `Ex0101.java` | 演習問題 01-01 の解答例 |

#### Main.java

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

**実行方法:**
1. IntelliJ IDEA で `Main.java` を開く
2. `main` メソッドの左にある ▶ をクリック → **Run** を選択
3. 画面下部のコンソールに `Hello, World!` と表示されれば成功

**コマンドラインの場合:**
```bash
javac src/Main.java
java -cp src Main
```

#### ポイント解説

| 要素 | 説明 |
|------|------|
| `public class Main` | クラスの宣言。ファイル名と同じ名前にする |
| `public static void main(String[] args)` | プログラムの開始地点（エントリーポイント） |
| `System.out.println(...)` | 文字列をコンソールに出力して改行する |
| `"Hello, World!"` | 文字列リテラル（ダブルクォートで囲む） |

---

## 3. 演習問題

### 演習 1: 自分の名前を表示する

`System.out.println` を使って、自分の名前をコンソールに表示するプログラムを作成してください。

<details>
<summary>解答例</summary>

```java
public class Ex0101 {
    public static void main(String[] args) {
        System.out.println("こんにちは。");
    }
}
```

</details>

### 演習 2: 複数行を表示する

`System.out.println` を複数回使って、以下の 3 行を表示するプログラムを作成してください。

```
1行目
2行目
3行目
```

<details>
<summary>解答例</summary>

```java
public class Ex0102 {
    public static void main(String[] args) {
        System.out.println("1行目");
        System.out.println("2行目");
        System.out.println("3行目");
    }
}
```

</details>

---

## まとめ

このテキストでは以下を学びました:

- **Java プログラムの基本構造**: クラス宣言と `main` メソッド
- **コンソール出力**: `System.out.println` による文字列の表示
- **実行方法**: IntelliJ IDEA およびコマンドラインでのコンパイルと実行

次のステップとして、標準出力とリテラルについて学んでいきましょう。