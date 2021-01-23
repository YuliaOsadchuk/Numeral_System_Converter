class Problem {
    public static void main(String[] args) {
        boolean find = false;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("mode")) {
                System.out.println(args[i + 1]);
                find = true;
                break;
            }
        }
        if (!find) {
            System.out.println("default");
        }
    }
}