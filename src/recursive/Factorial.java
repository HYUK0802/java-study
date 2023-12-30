package recursive;

public class Factorial {
//    팩토리얼 계산:
//    정수 n에 대한 팩토리얼을 계산하는 재귀 함수를 작성하세요.
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = calculateFactorial(5);
        System.out.println("Factorial of 5: " + result);
    }
}