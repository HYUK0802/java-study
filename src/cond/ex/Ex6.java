package cond.ex;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력해주세요");
        int a = sc.nextInt();
        System.out.println("두번째 숫자를 입력해주세요");
        int b = sc.nextInt();

        int max = (a > b) ? a : b;
        System.out.println("더 큰 숫자는 " + max + "입니다");
    }
}
