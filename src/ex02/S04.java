package ex02;

import java.util.Scanner;

//4. Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라. 평균값을 구하는 것이 아님에 주의
//        정수 3개 입력 >> 20 100 33
//        중간 값은 33
public class S04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 3개 입력 >> ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        //A가 중간일때
        if(A > B && A <C ){
            System.out.println(A + "가 중간 값");
        }
        else if(A>C && A<B){
            System.out.println(A + "가 중간 값");
        }
        //B가 중간일때
        else if(B>A && B<C){
            System.out.println(B + "가 중간 값");
        }else if(B>C && B<A){
            System.out.println(B + "가 중간 값");
        }
        //C가 중간일때
         else if(C>A && C<B){
            System.out.println(C + "가 중간 값");
        }else{
            System.out.println(C + "가 중간 값");
        }

    }
}
