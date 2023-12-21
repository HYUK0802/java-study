package cond.ex;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가지고 있는 달러를 입력해주세요");
        int dollar = sc.nextInt();

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다");
        } else {
            System.out.println("환전 금액은 " + dollar*1300 +"원입니다.");
        }
    }
}
