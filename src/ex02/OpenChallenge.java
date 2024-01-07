package ex02;

import java.util.Scanner;

//가위바위보 게임
//        두 사람이 하는 가위바위보 게임을 만들어보자.
//        두 사람의 이름은 '철수'와 '영희'이다. 먼저 "철수 >>"를 출력하고 "가위", "바위", "보" 중 하나를 문자열로 입력받는다.
//        그리고 "영희 >>"를 출력하고 마찬가지로 입력받는다. 입력받은 문자열을 비교하여 누가 이겼는지 판별하여 승자를 출력한다.

import java.awt.*;

public class OpenChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("철수 >>");
        String 철수 = scanner.next();

        System.out.println("영희 >>");
        String 영희 = scanner.next();

        if(철수.equals("가위")){
            if(영희.equals("가위")){
                System.out.println("비김");
            }
            else if(영희.equals("바위")){
                System.out.println("영희가 이김 ㅋㅋ");
            }
            else{
                System.out.println("철수가 이김 ㅋㅋ");
            }
        }

        else if(철수.equals("바위")){
            if(영희.equals("가위")){
                System.out.println("철수가 이김");
            }
            else if(영희.equals("바위")){
                System.out.println("비김ㅋㅋ");
            }
            else {
                System.out.println("영희가 이김 ㅋㅋ");
            }
        }

        else if (철수.equals("보")){
            if(영희.equals("가위")){
                System.out.println("영희가 이김");
            }
            else if(영희.equals("바위")){
                System.out.println("철수가 이김 ㅋㅋ");
            }
            else{
                System.out.println("비김");
            }
        }

        else{
            System.out.println("제대로 내십시오 ㅡㅡ");
        }

        scanner.close();
    }
}
