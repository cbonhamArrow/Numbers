import java.text.DecimalFormat;

public class Exercise8 {
    static DecimalFormat format1 = new DecimalFormat("$###,###.##");
    static DecimalFormat format2 = new DecimalFormat("(###,###.###)");
    static double input1 = 123456.783;
    static double input2 = -9876.32532;
    static double input3 = 23.19283928394829182;
    static int input4 = 123456;
    static double input5 = -9876.35532;

    public static void main(String[] args) {
        System.out.format("$%,6.2f %n", input1);
        System.out.format("%(,4.3f%n", input2);
        System.out.printf("%.6ef%n", input3);
        System.out.printf("%010d%n", input4);
        System.out.printf("%,4.1f", input5);
    }
}
