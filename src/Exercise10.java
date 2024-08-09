import java.text.DecimalFormat;

public class Exercise10 {

    static DecimalFormat format1 = new DecimalFormat("$###,###.##");
    static DecimalFormat format2 = new DecimalFormat("(#,###.###)");
    static DecimalFormat format3 = new DecimalFormat("0.######E00f");
    static DecimalFormat format4 = new DecimalFormat("0000000000");
    static DecimalFormat format5 = new DecimalFormat("#,###.#");

    static double input1 = 123456.783;
    static double input2 = -9876.32532;
    static double input3 = 23.19283928394829182;
    static int input4 = 123456;
    static double input5 = -9876.35532;

    public static void main(String[] args) {
        System.out.println(format1.format(input1));
        System.out.println(format2.format(Math.abs(input2)));
        System.out.println(format3.format(input3));
        System.out.println(format4.format(input4));
        System.out.println(format5.format(input5));

    }
}
