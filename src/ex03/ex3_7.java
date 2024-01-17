package ex03;

import java.util.Scanner;

//양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램을 작성하라.

public class ex3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intArray[] = new int [5];
        int best = 0;

        System.out.println("양수 5개를 입력하시오");

        for(int i=0;i<5;i++){
            System.out.print(">>");
            intArray[i] = scanner.nextInt();

            if(best<intArray[i]){
                best = intArray[i];
            }
        }
        System.out.println("최강 베스트 큰 수는 : "+ best);
    }
}
