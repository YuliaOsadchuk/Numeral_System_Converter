package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sourceRadix = scanner.nextInt();
        int number = scanner.nextInt();
        int targetRadix = scanner.nextInt();
        String s = "";
        if (sourceRadix == 1) {
            int numberDex = Integer.parseInt(String.valueOf(String.valueOf(number).length()));
            s = Integer.toString(numberDex, targetRadix);
        } else if (sourceRadix == 10 && targetRadix != 1) {
            s = Integer.toString(number, targetRadix);
        } else if (sourceRadix ==10 && targetRadix == 1) {
            if (sourceRadix == 10) {
                for (int i = 0; i < number; i++) {
                    s = s + 1;
                }
            } else {
                int newNumber = Integer.parseInt(String.valueOf(number), sourceRadix);
                for (int i = 0; i < newNumber; i++) {
                    s = s + 1;
                }
            }
        } else {
            int newNumber = Integer.parseInt(String.valueOf(number), sourceRadix);
            s = Integer.toString(newNumber, targetRadix);
        }

        System.out.println(s);


        /*if (radix == 16) {
            System.out.println("0x" + Integer.toHexString(n));
        } else if (radix == 8) {
            System.out.println("0" + Integer.toOctalString(n));
        } else if (radix == 2) {
            System.out.println("0b" + Integer.toBinaryString(n));
        }*/

    }
}
