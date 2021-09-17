// コンストラクタのオーバーロード
class StudenCard {
    int id;
    String name;

    StudenCard() {
        System.out.println("引数のないコンストラクタが実行されました");
        this.id = 0;
        this.name = "未定";
    }

    StudenCard(String name) {
        System.out.println("引数が1つのコンストラクタが実行されました");
        this.id = 0;
        this.name = name;
    }

    StudenCard(int id, String name) {
        System.out.println("引数が2つのコンストラクタが実行されました");
        this.id = id;
        this.name = name;
    }
}

public class ConstructorOverloadExample {
    public static void main(String[] args) {
        StudenCard a = new StudenCard();
        System.out.println("aのidの値は" + a.id);
        System.out.println("aのnameの値は" + a.name);

        StudenCard b = new StudenCard();
        System.out.println("bのidの値は" + b.id);
        System.out.println("bのnameの値は" + b.name);

        StudenCard c = new StudenCard();
        System.out.println("cのidの値は" + c.id);
        System.out.println("cのnameの値は" + c.name);
    }    
}
