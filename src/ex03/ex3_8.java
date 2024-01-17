package ex03;

import java.util.Scanner;

//배열의 length필드를 이용하여 배열 크기만큼 정수를 입력받고 평균을 구하는 프로그램을 작성하라.

public class ex3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int A[] = new int [5];

        System.out.println("배열 크기만큼 정수를 입력해보거라");
        for(int i=0;i<A.length;i++){
            System.out.print(">>");
            A[i] = scanner.nextInt();
            sum += A[i];
        }
        System.out.println("당신이 입력한 정수들의 평균은 : "+(double)sum/A.length);
    }
}
