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
- **ソースルート**: `src/`（デフォルトパッケージ）

```
src/
├── Main.java           # Hello World（エントリーポイント）
├── SampleXX.java       # サンプルコード
├── LiteralXXx.java     # リテラル解説
└── ExXXXX.java         # 演習問題
```

## ビルド・テスト・開発コマンド

```bash
# コンパイル
javac src/<ClassName>.java

# 実行
java -cp src <ClassName>
```

- テストフレームワークは未導入。

## コーディング規約と命名

- 各ファイルは `public static void main(String[] args)` を持つ独立したプログラム。
- パッケージ宣言なし（デフォルトパッケージ）。
- ファイル命名規則:

| プレフィックス | 用途 | 例 |
|--------------|------|-----|
| `Main` | エントリーポイント | `Main.java` |
| `SampleXX` | サンプルコード | `Sample01.java` |
| `LiteralXXx` | リテラル解説（a, b で枝番） | `Literal03a.java` |
| `ExXXXX` | 演習問題（章番号+問番号） | `Ex0101.java` |

## 設定・環境

- **JDK**: 11 以上
- **GitHub Actions**:
  - `claude-review.yml` — PR コメントで `@claude` を付けると AI レビュー（要 `ANTHROPIC_API_KEY`）

## ドキュメント

- `README.md` : プロジェクト概要とセットアップ手順。
- `TUTORIAL.md` : 授業用テキスト。解説と演習問題。
- `AGENTS.md` : AI エージェント向け共通ルール（本ファイル）。
