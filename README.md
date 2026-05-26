# Jec26CMJavaVol08

Java 基礎 Vol08 ―「**メソッド**」を学ぶための授業用プロジェクトです。
ビルドツール不要で、IntelliJ IDEA からすぐに実行できます。

## NotebookLM 補足資料
https://notebooklm.google.com/notebook/fc30f692-9b4d-473d-a83c-246a7b16c92a

## 必要環境

- **JDK** 11 以上
- **IntelliJ IDEA**（Community Edition 可）

## セットアップ

1. このリポジトリをクローンする
2. IntelliJ IDEA でプロジェクトを開く（`JecJavaTemplate.iml` が自動認識されます）
3. Project SDK に JDK を設定する

## 使い方

IntelliJ IDEA 上で各 Java ファイルの `main` メソッドを右クリック → **Run** で実行できます。

コマンドラインで実行する場合:

```bash
# デフォルトパッケージ（src/ 直下）の例
javac src/SampleMethod01b.java
java -cp src SampleMethod01b

# パッケージ付き（vol08_2 / vol08_3）の例
javac -d out src/vol08_2/SampleCall01.java
java -cp out vol08_2.SampleCall01
```

## プロジェクト構成

```
src/
├── Main.java                # 参照型と値渡し/参照渡しの動作確認
├── SampleMethod01a.java     # メソッド導入 (a) 同じ処理の繰り返し
├── SampleMethod01b.java     # メソッド導入 (b) 共通処理をメソッド化
├── SampleMethod01c.java     # メソッド導入 (c) 表示処理もメソッド化
├── SampleMethodLocal0X.java # ローカル変数とスコープ
├── SampleOverload01.java    # オーバーロード
├── SampleReturn02.java      # 戻り値
├── SignatureSample01.java   # メソッドシグネチャ
├── Kakunin01.java           # 確認問題（識別子・修飾子）
├── Test08XX.java            # 章番号付き演習問題（08 + 問番号）
├── vol08_2/                 # package vol08_2: メソッドの基礎
└── vol08_3/                 # package vol08_3: main・可変長引数・オーバーロード解決
```

多くのファイルは `public static void main(String[] args)` を持つ独立したプログラムです。
外部ライブラリは使用せず、Java 標準ライブラリのみで動作します。

> 一部の `TestMainXX.java` などは「意図的にコンパイルエラーになる例」を題材としているため、
> エラー箇所を実コードとして残しています。単体コンパイルで失敗することは仕様です。

### 学習トピック

| パッケージ | 主なトピック |
|-----------|-------------|
| `src/` 直下 | メソッドの導入、ローカル変数、シグネチャ、識別子の確認問題、章番号付き演習 |
| `vol08_2` | メソッド呼び出し、引数の拡大/縮小変換、戻り値、オーバーロードの基本 |
| `vol08_3` | `main` メソッドの詳細、コマンドライン引数、可変長引数、オーバーロード解決 |

### ファイル命名規則

| プレフィックス | 用途 | 例 |
|--------------|------|-----|
| `Main` | エントリーポイント／動作確認 | `Main.java` |
| `Sample<トピック>0X` | サンプルコード（必要に応じ `a`/`b`/`c` の枝番） | `SampleMethod01a.java`, `SampleCall01.java` |
| `Test08XX` | 章番号付き演習問題（08 + 問番号） | `Test0801.java` |
| `TestX` / `Test<トピック>0X` | 連番の演習問題 | `Test1.java`, `TestMain01.java`, `TestVarArg01.java` |
| `Kakunin0X` | 確認問題 | `Kakunin01.java` |
| `App` | パッケージ単位の動作確認用 | `vol08_2/App.java` |

## GitHub Actions

### Claude Code Review
`.github/workflows/claude-review.yml` を使うには、GitHub Secrets の設定が必要です。

設定手順:
1. GitHub のリポジトリ画面で `Settings` → `Secrets and variables` → `Actions` → `New repository secret`
2. Name: `ANTHROPIC_API_KEY`
3. Value: Anthropic の API キー

動作:
- コメントで `@claude` を付けるとレビュー応答（Owner/Member/Collaborator のみ）

### Junie Code Review
`.github/workflows/junie-review.yml` を使うには、GitHub Secrets の設定が必要です。

設定手順:
1. GitHub のリポジトリ画面で `Settings` → `Secrets and variables` → `Actions` → `New repository secret`
2. Name: `JUNIE_API_KEY`
3. Value: JetBrains Junie の API キー

動作:
- PR 作成/更新で自動実行
- レビューコメントは同一コメントを更新（`use_single_comment: true`）

## ドキュメント

- `README.md` : プロジェクト概要とセットアップ手順（本ファイル）。
- `TUTORIAL.md` : 授業用テキスト。Vol08（メソッド）の解説と演習問題。
- `FLOWCHARTS_AND_TRACES.md` : コンパイルエラー確認用サンプルのフローチャートとトレース表。
- `AGENTS.md` : AI エージェント向け共通ルール。

## 貢献

開発方針や規約は `AGENTS.md` を参照してください。

## ライセンス

未設定です。必要に応じて追加してください。
