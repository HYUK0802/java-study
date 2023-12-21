package cond.ex;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("거리를 입력해주세요");
        int distance = sc.nextInt();

        if (distance > 100) {
            System.out.println("비행기를 이용하세요");
        } else if (distance > 10) {
            System.out.println("자동차를 이용하세요");
        } else if (distance > 1) {
            System.out.println("자전거를 이용하세요");
        }else {
            System.out.println("걸으세요");
        }
    }
}
