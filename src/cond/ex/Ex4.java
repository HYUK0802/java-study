package cond.ex;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("평점을 입력하세요");
        double rating = sc.nextDouble();

        if (rating <= 9) {
            System.out.println("'어바웃 타임'를 추천합니다.");
        }if (rating <= 8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }if (rating <= 7){
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}
