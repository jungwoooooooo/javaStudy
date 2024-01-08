package ex02;

import java.util.Scanner;

//6. 369게임을 간단히 작성해보자. 1~99까지의 정수를 입력받고 정수에 3,6,9 중 하나가 있는 경우는
// "박수짝"을 출력하고 두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하라.
// 예를 들면, 키보드로 입력된 수가 13인 경우 "박수짝"을, 36인 경우 "박수짝짝"을 출력하면 된다. #자바369게임 #자바베스킨라빈스
//        1~99 사이의 정수를 입력하시오 >> 36
//        박수짝짝

//내가 생각한 방법 : 십의 자리 일의 자리 일단 따로 나누고
//        3으로 나누어지면 박수 짝 또는 박수 짝짝 이거 두개
//        하나만 369면 박수 짝
//        둘다 동시에 369이면 박수 짝짝
//        둘다 아니면 아닌걸로
public class S06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1~99 사이의 정수를 입력하시오 >> ");
        int number = scanner.nextInt();

        int 십의 = number/10;
        int 일의 = number%10;

        if(number>10){  //일의 자리만 있을때도 박수 짝짝이 나오므로 10의 자리가 넘었을때만 둘다 369중 하나가 있을때 박수 짝짝이 나오도록 ㅋㅋ
            if(십의%3 == 0 && 일의%3 == 0){
                System.out.println("박수 짝짝");
            }
        }
        else if(십의%3 == 0 || 일의%3 ==0){
            System.out.println("박수 짝");
        }
        else{
            System.out.println("바보 ㅋㅋㅋ");
        }

        scanner.close();
    }
}
