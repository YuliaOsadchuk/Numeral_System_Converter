//class Main {

    public static long get(int x) {
        long result = 1;
        if (x < 0) {
            return -1;
        } else if (x == 0) {
            return 1;
        } else if (x == 1) {
            return 1;
        }
        result = x * get(x - 1);
        return result;
    }

   /* public static void main(String[] args) {
        System.out.println(get(0));
        System.out.println(get(1));
        System.out.println(get(2));
        System.out.println(get(3));
        System.out.println(get(4));
        System.out.println(get(5));
    }
}*/