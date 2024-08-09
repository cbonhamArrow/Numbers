public class Exercise11 {

    public static int sumOf(String input1, String input2) {
        int int1 = Integer.parseInt(input1);
        int int2 = Integer.parseInt(input2);
        return int1 + int2;
    }

    public static void main(String[] args) {
        System.out.println(sumOf("37", "13"));
    }
}
