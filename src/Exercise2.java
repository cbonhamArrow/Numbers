//What's an alternate way to sum up two numbers without using the + symbol?

public class Exercise2 {

    public static int twoNumbers(int num1, int num2) {
        return Math.addExact(num1, num2);
    }

    public static void main(String[] args) {
        System.out.println(twoNumbers(4,5));
    }
}
