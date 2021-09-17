class StudentCard {
    // クラス変数の宣言。ゼロで初期化。
    static int counter = 0;
    int id;
    String name;

    // コンストラクタの宣言
    StudentCard(int id, String name) {
        System.out.println("StudenCardクラスのコンストラクタが呼び出されました");

        this.id = id;
        this.name = name;
        // クラス変数counterの値を1増やす
        StudentCard.counter++;
        }
}
