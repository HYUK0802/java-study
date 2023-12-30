package recursive;

public class Power {
//    거듭제곱 계산:
//
//정수 base와 exponent에 대한 거듭제곱을 계산하는 재귀 함수를 작성하세요.
    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * calculatePower(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        int result = calculatePower(2, 3);
        System.out.println("2^3: " + result);
    }
}