public class Fibo {
    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
          System.out.println(n + ": " + fibonacci(n));
    }

}

