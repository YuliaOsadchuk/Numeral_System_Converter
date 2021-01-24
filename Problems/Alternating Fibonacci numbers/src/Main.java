import java.util.Scanner;

public class Main {

    public static long fib(long n) {
        long f = newFib(n);
        return n % 2 == 0 ? f * (-1) : f;
    }

    public static long newFib(long n) {
        if (n <= 1) {
            return n;
        }

        return newFib(n - 1) + newFib(n - 2);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
}