package recursive;

public class Fibonacci {
//    피보나치 수열:
//    정수 n에 대한 피보나치 수열의 n번째 항을 계산하는 재귀 함수를 작성하세요.
    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int result = calculateFibonacci(5);
        System.out.println("Fibonacci of 6: " + result);
    }
}