public class StaticVariableExample {
    public static void main(String[] args) {
        System.out.println("StudentCard.counter=" + StudentCard.counter);
        StudentCard a = new StudentCard(12345, "鈴木");
        System.out.println("StudentCard.counter=" + StudentCard.counter);
        StudentCard b = new StudentCard(12346, "佐香");
        System.out.println("StudentCard.counter=" + StudentCard.counter);
    }   
}
