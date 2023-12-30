package recursive;

public class Fibonacci2 {
    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int result = Fibonacci(5);
        System.out.println(result);
    }
}
