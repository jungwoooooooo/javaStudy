package ex02;
import java.util.Scanner;

public class CheckTime {
    public static void main(String [] args){
        System.out.println("두개의 정수를 빈칸을 통해 입력해주세요");

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();

        int B = scanner.nextInt();

        int sum = A+B;

        System.out.println("합은 "+ sum);

    }
}
