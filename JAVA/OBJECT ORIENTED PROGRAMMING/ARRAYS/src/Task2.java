public class Task2 {
    public static int calculate(int a, int b) {
        return a + b;
    }

    public static int calculate1(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        int number1 = 45;
        int number2 = 65;

        System.out.println(calculate(number1, number2));
        System.out.println(calculate1(number1, number2));
    }
}
