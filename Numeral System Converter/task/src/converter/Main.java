package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sourceRadix = scanner.nextInt();
        String number = scanner.next();
        int targetRadix = scanner.nextInt();
        String[] n = number.split(".");


        int numberDecimal = conversionToDecimal(sourceRadix, n[0]);
        System.out.println(conversionToTargetRadix(numberDecimal, targetRadix));
    }

    public static int conversionToDecimal(int sourceRadix, String number) {
        number = conversionLetter(number);
        if (sourceRadix == 1) {
            return Integer.parseInt(String.valueOf(number.length()));
        } else {
            return Integer.parseInt(String.valueOf(number), sourceRadix);
        }
    }

    public static String conversionToTargetRadix(int number, int targetRadix) {
        if (targetRadix == 1) {
            String s = "";
            for (int i = 0; i < number; i++) {
                s = s + 1;
            }
            return s;
        } else {
            return Integer.toString(number, targetRadix);
        }
    }

    public static String conversionLetter(String number) {
        char[] ch = number.toCharArray();
        for (int i = 0; i < ch.length; i++) {

        }
        return number;
    }

}
