public class Fibonacci {
    public static int CalcFibonacci(int n) {
        if (n <= 1) {
            return n;
        }else {
            return CalcFibonacci(n - 1) + CalcFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int result = CalcFibonacci(5);
        System.out.println(result);
    }
}
