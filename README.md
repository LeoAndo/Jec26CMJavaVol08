# JecJavaTemplate

Java 基礎を学ぶための授業用テンプレートプロジェクトです。
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
# コンパイル（例: Main.java）
javac src/Main.java

# 実行
java -cp src Main
```

## プロジェクト構成

```
src/
├── Main.java           # Hello World
├── Sample01.java       # サンプルコード 01
├── Sample02.java       # サンプルコード 02
├── Literal03a.java     # リテラル解説 03a
├── Literal03b.java     # リテラル解説 03b
└── Ex0101.java         # 演習問題 01-01
```

各ファイルは `public static void main(String[] args)` を持つ独立したプログラムです。
外部ライブラリは使用せず、Java 標準ライブラリのみで動作します。

### ファイル命名規則

| プレフィックス | 用途 | 例 |
|--------------|------|-----|
| `Main` | エントリーポイント | `Main.java` |
| `SampleXX` | サンプルコード | `Sample01.java` |
| `LiteralXXx` | リテラル解説 | `Literal03a.java` |
| `ExXXXX` | 演習問題 | `Ex0101.java` |

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
- `TUTORIAL.md` : 授業用テキスト。解説と演習問題。
- `AGENTS.md` : AI エージェント向け共通ルール。

## 貢献

開発方針や規約は `AGENTS.md` を参照してください。

## ライセンス

未設定です。必要に応じて追加してください。
