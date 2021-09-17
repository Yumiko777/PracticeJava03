public class StaticMethodExample {
    public static void main(String[] args) {
        // SimpleCalcクラスで宣言されたgetTriangleAreaクラスメソッドの呼び出し
        System.out.println("底辺が10、高さが5の三角形の面積は" + SimpleCalc.getTriangleArea(10, 5.0) + "です");
    }  
}
