class StudenCard {
    int id;
    String name;

    // コンストラクタの宣言。コンストラクタはクラス名と同じ名前で、戻り値の定義なし
    StudenCard(int id, String name) {
        System.out.println("StudentCard クラスのコンストラクタが呼び出されました");
        // インスタンス変数idに1つ目の引数で渡された値を代入する
        // thisは自分自身を意味する　自分自身のインスタンス変数id
        this.id = id;
        this.name = name;
    }
}

public class ConstrctorExample {
    public static void main(String[] args) {
        // 学籍番号と氏名を引数に指定して、StudenCardクラスのインスタンスを生成する
        StudenCard a = new StudenCard(1234, "鈴木");

        System.out.println("aのidの値は" + a.id);
        System.out.println("aのnameの値は" + a.name);
    }
}