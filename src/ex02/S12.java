package ex02;

import java.util.Scanner;

//12. 사칙 연산을 입력받아 계산하는 프로그램을 작성하고자 한다. 연산자는 + - * / 의 네 가지로 하고 피연산자는 모두 실수로 한다.
//        피연산자와 연산자는 실행 사례와 같이 빈 칸으로 분리하여 입력한다. 0으로 나누기 시 "0으로 나눌 수 없습니다."를 출력하고 종료한다.
//
//        연산 >> 2+4
//        2+4의 계산 결과는 6
//
//        ※ 문자열 s가 "+"와 같은 지 검사하려면 if(s.equals.("+"))를 이용하며, true이면 s와 "+"가 같다.

public class S12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("연산 >> ");

        double first = scanner.nextDouble();
        String 연산 = scanner.next();
        double second = scanner.nextDouble();

        if(연산.equals("+")){
            System.out.println(first + "+" + second + "=" + (first+second));
        }
        else if(연산.equals("-")){
            System.out.println(first + "-" + second + "=" + (first-second));
        }
        else if(연산.equals("*")){
            System.out.println(first + "*" + second + "=" + (first*second));
        }
        else if(연산.equals("/")){
            if(first == 0 && second == 0){
                System.out.println("0으로 나눌 수 없습니다.");
            }
            else{
                System.out.println(first + "/" + second + "=" + (first/second));
            }
        }
        else{
            System.out.println("제대로 문제를 내시오 ㅡㅡ");
        }

        scanner.close();
    }
}
