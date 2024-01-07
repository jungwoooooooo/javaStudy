package ex02;

import java.util.Scanner;

//5. Scanner 를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고 이 3개의 수로 삼각형을 만들 수 있는 지 판별하라.
//        삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 커야 한다.
//        정수 3개 입력 >> 4 3 5
//        삼각형이 됩니다.
public class S05 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("정수 3개 입력 >> ");
//        int A = scanner.nextInt();
//        int B = scanner.nextInt();
//        int C = scanner.nextInt();
//
//        if((A+B)>C){
//            System.out.println("삼각형이 됩니다.");
//        }
//        else if((A+C)>B){
//            System.out.println("삼각형이 됩니다.");
//        }
//        else if((B+C)>A){
//            System.out.println("삼각형이 됩니다.");
//        }
//        else{
//            System.out.println("삼각형이 되겠노 ㅋㅋㅋㅋ?.");
//        }
//
//        scanner.close();
//    } 오답 1789654 1 1 을 입력해도 삼각형이 된단다. ㅋㅋㅋㅋ 어떻게 바꿔야 할까
    
// 음 3변이 있을때 두변의 합이 한 변보다 커야 삼각형이 된다.
// 근데 999999999 1 1도 삼각형이 된다는거다 안되야 정상이잖슴
// A,B,C 가 있을떄 A+B 가 C보다 크면서 B+C가 A보다 크면 C+A 가 B가 커야 한다는거네
    // 저 3개를 동시에 if문으로 돌리면 가능하겠다. 해보자

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수를 입력 >> ");
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if((A+B)>C && (B+C)>A && (A+C)>B){
            System.out.println("삼각형 가능");
        }
        else{
            System.out.println("되겠냐고 ㅋㅋㅋㅋ 똥바보야 ㅋㅋ");
        }
    }
}
