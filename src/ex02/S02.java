package ex02;

import java.util.Scanner;

//2. Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고, 십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.
//
//        2자리수 정수 입력(10~99) >> 77
//        Yes! 10의 자리와 1의 자리가 같습니다.

public class S02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("10~99 사이의 수를 입력하세요");
        int number = scanner.nextInt();
        int numberTen = number/10;
        int numberOne = number%10;

        if(numberTen == numberOne){
            System.out.println("yes 10의 자리와 1의 자리가 같습니다.");
        }
        else{
            System.out.println("no!!! 10의 자리와 1의 자리가 다르다 !!!!!!!");
        }


    }
}
