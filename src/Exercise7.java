//Write a function that takes a String input of “$12,345.83” and prints out that value divided
//by 32.19. It should return $383.53.

import java.text.NumberFormat;
import java.text.ParseException;

public class Exercise7 {

    public static void printThatValueDividedBy32(String input) throws ParseException {
        NumberFormat money = NumberFormat.getCurrencyInstance();
        Number inputParsed = money.parse(input);
        double output = inputParsed.doubleValue() / 32.19;
        System.out.println(money.format(output));
    }

    public static void main(String[] args) throws ParseException {
        printThatValueDividedBy32("$12,345.83");
    }
}
