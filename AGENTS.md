# Repository Guidelines

このファイルは AI エージェント向けの **Single Source of Truth** です。
コード生成・レビュー時に必ず従ってください。

## AI エージェントへの指示

- コードは授業教材として使用するため、**シンプルさ・可読性を最優先**すること。
- 新しいソースファイルを追加する場合は下記の命名規則に従うこと。
- コメントは**日本語**で記述すること。
- **外部ライブラリを導入しないこと**（Java 標準ライブラリのみ使用可）。

## プロジェクト構成とモジュール

- **言語**: Java（標準ライブラリのみ、外部依存なし）
- **IDE**: IntelliJ IDEA（`.iml` プロジェクト）
- **ビルドツール**: なし（`javac` / `java` で直接コンパイル・実行）
- **ソースルート**: `src/`
- **テーマ**: Vol08 ― メソッド（定義・呼び出し・引数・戻り値・オーバーロード・可変長引数 など）

```
src/
├── Main.java                     # 参照型と値渡し/参照渡しの動作確認
├── SampleMethod01x.java          # メソッドの導入（a/b/c で段階解説）
├── SampleMethodLocal0X.java      # ローカル変数とスコープ
├── SampleOverload0X.java         # オーバーロード
├── SampleReturn0X.java           # 戻り値
├── SignatureSample0X.java        # メソッドシグネチャ
├── Kakunin0X.java                # 確認問題（識別子・修飾子）
├── Test08XX.java                 # 章番号付き演習問題（4桁: 章+問番号）
├── vol08_2/                      # package vol08_2: メソッドの基礎
│   ├── App.java                  # 動作確認用エントリ
│   ├── SampleCall0X.java         # メソッドの呼び出し
│   ├── SampleArg0X.java          # 引数（拡大変換・縮小変換）
│   ├── SampleReturn0X.java       # 戻り値
│   ├── SampleMethodLocal0X.java  # ローカル変数
│   ├── SampleOverload0X.java     # オーバーロード
│   └── Test08XX.java             # 演習問題
└── vol08_3/                      # package vol08_3: メソッドの応用
    ├── SampleMainMethod0X.java   # main メソッドのバリエーション
    ├── SampleStaticMethod0X.java # static メソッド
    ├── SampleCommArgs.java       # コマンドライン引数
    ├── SampleVarArg0X.java       # 可変長引数
    ├── SampleVarArgOverride0X.java # 可変長引数とオーバーロード
    ├── SampleCallOverload0X.java # オーバーロード解決
    ├── TestMain0X.java           # main メソッドの演習
    ├── TestVarArg0X.java         # 可変長引数の演習
    └── TestX.java                 # 演習問題（1〜2桁の連番）
```

## ビルド・テスト・開発コマンド

```bash
# コンパイル（デフォルトパッケージのファイル）
javac src/<ClassName>.java

# 実行（デフォルトパッケージ）
java -cp src <ClassName>

# コンパイル（パッケージ付きのファイル）
javac -d out src/vol08_2/<ClassName>.java

# 実行（パッケージ付き）
java -cp out vol08_2.<ClassName>
```

- テストフレームワークは未導入。`TestXXXX.java` は JUnit ではなく、出力を目視で確認する演習問題。

## コーディング規約と命名

- 各ファイルは `public static void main(String[] args)` を持つ独立したプログラム（一部の `TestMainXX` 等、意図的にコンパイルエラーを示す題材を除く）。
- パッケージ宣言:
  - `src/` 直下のファイルはデフォルトパッケージ（宣言なし）
  - `src/vol08_2/` 配下は `package vol08_2;`
  - `src/vol08_3/` 配下は `package vol08_3;`
- ファイル命名規則:

| プレフィックス | 用途 | 例 |
|--------------|------|-----|
| `Main` | エントリーポイント／動作確認 | `Main.java` |
| `Sample<トピック>0X` | サンプルコード（数字 2 桁の連番、必要なら `a`/`b`/`c` の枝番） | `SampleMethod01a.java`, `SampleCall01.java` |
| `Test08XX` | 章番号付き演習問題（先頭 2 桁が章番号 `08`、後 2 桁が問番号） | `Test0801.java` |
| `TestX` / `Test<トピック>0X` | 章番号なしの演習問題（連番） | `Test1.java`, `TestMain01.java`, `TestVarArg01.java` |
| `Kakunin0X` | 確認問題（用語・識別子・修飾子の整理） | `Kakunin01.java` |
| `App` | パッケージ単位の動作確認用エントリ | `vol08_2/App.java` |

- コメントアウトされた箇所は「意図的にコンパイルエラーになるコード」を示すための題材。安易に削除・修正しないこと。

## 設定・環境

- **JDK**: 11 以上
- **GitHub Actions**:
  - `claude-review.yml` — PR コメントで `@claude` を付けると AI レビュー（要 `ANTHROPIC_API_KEY`）

## ドキュメント

- `README.md` : プロジェクト概要とセットアップ手順。
- `TUTORIAL.md` : 授業用テキスト。Vol08（メソッド）の解説と演習問題。
- `AGENTS.md` : AI エージェント向け共通ルール（本ファイル）。
