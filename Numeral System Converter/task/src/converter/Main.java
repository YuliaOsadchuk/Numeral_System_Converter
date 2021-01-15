package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int radix = scanner.nextInt();
        if (radix == 16) {
            System.out.println("0x" + Integer.toHexString(n));
        } else if (radix == 8) {
            System.out.println("0" + Integer.toOctalString(n));
        } else if (radix == 2) {
            System.out.println("0b" + Integer.toBinaryString(n));
        }

    }
}
