package ex02;

import java.util.Scanner;

//3. Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권, 500원짜리 동전,
// 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇개로 변환되는지 출력하라.
//        금액을 입력하시오 >> 65376
//        오만 원권 1매
//        만 원권 1매
//        천 원권 5매
//        100원 3개
//        50원 1개
//        10원 2개
//        1원 6개
public class S03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("금액을 입력하시오 >> ");

        int won = scanner.nextInt();
        int 오만 = won/50000;
        int 만 = won%50000/10000;
        int 천 = won%50000%10000/1000;
        int 백 = won%50000%10000%1000/100;
        int 오십 = won%50000%10000%1000%100/50;
        int 십 = won%50000%10000%1000%100%50/10;
        int 일 = won%50000%10000%1000%100%50%10/1;

        System.out.println("5만원 권 " + 오만 + "매");
        System.out.println("만원 권 " + 만 + "매");
        System.out.println("천원 권 " + 천 + "장");
        System.out.println("100원 " + 백 + "개");
        System.out.println("50원 " + 오십 + "개");
        System.out.println("10원 " + 십 + "개");
        System.out.println("1원 " + 일 + "개");

    }
}
