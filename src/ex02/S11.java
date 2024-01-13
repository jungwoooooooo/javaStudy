package ex02;

import java.util.Scanner;

//11. 숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울,
//        그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라. if-else 문과 switch 둘 다 이용해볼 것.
//
//        달을 입력하세요(1~12) >> 9
//        가을
//         (1) if-else 문을 이용하여 프로그램을 작성하라.
//         (2) switch 문을 이용하여 프로그램을 작성하라.
public class S11 {

//    (2) switch 문을 이용

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("달을입력하세요(1~12) >> ");
        int 달 = scanner.nextInt();

        switch(달){
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("겨울");
        }

        scanner.close();
    }

//  (1) if~else 문을 이용
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("달을입력하세요(1~12) >> ");
//        int 달 = scanner.nextInt();
//
//        if(1<=달 && 달<=12){
//            if(3 <= 달 && 달 <= 5 ){
//                System.out.println("봄");
//            }
//            else if(6 <= 달 && 달 <= 8){
//                System.out.println("여름");
//            }
//            else if(9 <= 달 && 달 <= 11){
//                System.out.println("가을");
//            }
//            else{
//                System.out.println("겨울 ㅋㅋ");
//            }
//        }
//        else{
//            System.out.println("범위를 벗어났다. ㅡㅡ ");
//        }
//
//        scanner.close();
//    }
}
