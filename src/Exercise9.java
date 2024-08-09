
public class Exercise9 {

    static double input1 = 123456.783;
    static double input2 = -9876.32532;
    static double input3 = 23.19283928394829182;
    static int input4 = 123456;
    static double input5 = -9876.35532;

    static String output1 = String.format("$%,6.2f",input1);
    static String output2 = String.format("%(,4.3f",input2);
    static String output3 = String.format("%.6ef",input3);
    static String output4 = String.format("%010d",input4);
    static String output5 = String.format("%,4.1f",input5);

    public static void main(String[] args) {
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
        System.out.println(output5);
    }
}
