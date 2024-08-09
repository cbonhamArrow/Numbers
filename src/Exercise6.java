//Write a function that takes a String like “149.32” and formats it as money for wherever you
//live. So, if you live in the United States, it would return “$149.32”, Korea = ₩149, France/
//EU = 149,32 €, etc.

import java.text.NumberFormat;

public class Exercise6 {

    public static String formatMoney(String input) {
        NumberFormat money = NumberFormat.getCurrencyInstance();
        return money.format(Double.parseDouble(input));
    }

    public static void main(String[] args) {
        System.out.println(formatMoney("143.89"));
    }

}
