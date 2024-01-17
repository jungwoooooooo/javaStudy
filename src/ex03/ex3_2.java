package ex03;

import java.util.Scanner;

//while문을 이용하여 -1이 입력될 때까지 정수를
//계속 입력받아 합을 구하고 평균을 출력하는 프로그램을 작성하라.
public class ex3_2 {
    public static void main(String[] args) {
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하시오 >> ");
        int i = scanner.nextInt();

        while(i != -1){
            sum += i;
        }
        System.out.println("지금까지의 합 : "+sum);
    }
}
