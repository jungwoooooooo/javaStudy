package ex03;

import java.util.Scanner;

//5개의 정수를 입력받고 그 중 양수들만 합하여 출력하는 프로그램 작성
//입력된 수가 0이나 음수이면 continue 문을 이용하여 합하지 않고 다음 반복으로 넘어간다.

public class ex3_5 {
    public static void main(String[] args) {
        int sum=0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하시오");

        for(int i =0; i<5 ; i++){
            int a = scanner.nextInt();

            if(a<=0){
                continue;
            }
            else{
                sum += a;
            }
        }
        System.out.println("5개의 정수의 합은 = " + sum);

    }
}
