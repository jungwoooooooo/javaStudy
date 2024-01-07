package ex02;

import java.util.Scanner;

//1. Scanner 클래스를 이용하여 입력받은 원화 값을 달러로 바꾸어 다음 예시와 같이 출력하는 프로그램을 작성하라. ($1=1100원으로 가정)
//
//        원화를 입력하세요(단위 원) >> 3300
//        3300원은 $3.0입니다.
public class S01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("원화 값(단위 원)을 입력하시오 >> ");

        int won = scanner.nextInt();

        double doller = won/1100.0;

        System.out.println(won+"원은 " + "$" + doller + "입니다");

    }
}
