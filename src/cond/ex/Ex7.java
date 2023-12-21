package cond.ex;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println(x + "는 " + result + "입니다.");
    }
}
