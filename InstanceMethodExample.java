class StudenCard {
    int id;
    String name;

    StudenCard (int id, String name) {
        this.id = id;
        this.name = name;
    }

    // StudenCardクラスに追加したインスタンスメソッドの宣言
    void printInfo() {
        // インスタンスメソッドではthisキーワードを使ってインスタンス変数を参照できる
        System.out.println("学籍番号:" + this.id);
        System.out.println("氏名:" + this.name);
    }
}

public class InstanceMethodExample {
    public static void main(String[] args) {
        StudenCard a = new StudenCard(1234, "鈴木");
        StudenCard b = new StudenCard(1235, "佐藤");
        // StudenCardクラスのインスタンスaに対してprintInfoメソッドを呼び出している
        a.printInfo();
        b.printInfo();
    }   
}
