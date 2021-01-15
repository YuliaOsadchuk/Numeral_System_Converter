package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int octopus = Integer.parseInt(Integer.toOctalString(n));
        System.out.println(octopus % 10);
    }
}
