package ex02;

import java.util.Scanner;

//10. 원의 정보를 받기 위해 키보드로부터 원의 중심을 나타내는 한 점과 반지름을 입력받는다.
//        두 개의 원을 입력받고 두 원이 서로 겹치는지 판단하여 출력하라.
//
//        첫번째 원의 중심과 반지름 입력>> 10 10 3
//        두번째 원의 중심과 반지름 입력>> 12 12 2
//        두 원은 서로 겹친다.
//
//        ※ 두 개의 반지름의 합보다 작으면 원이 겹칩니다. ??? 이게 뭔 소리일까
//          두 중심의 거리가 < 반지름이면 원이 겹친다는 뜻 .

public class S10 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("첫번째 원의 중심과 반지름 입력 >> ");

        int firstCircleMiddleX = scanner.nextInt();
        int firstCircleMiddleY = scanner.nextInt();
        int firstCircle반지름 = scanner.nextInt();

        System.out.println("두번째 원의 중심과 반지름 입력 >> ");

        int secondCircleMiddleX = scanner.nextInt();
        int secondCircleMiddleY = scanner.nextInt();
        int secondCircle반지름 = scanner.nextInt();

        double distance = 0;

        distance = Math.sqrt((secondCircleMiddleX-firstCircleMiddleX)*(secondCircleMiddleX-firstCircleMiddleX)
    +(secondCircleMiddleY-firstCircleMiddleY)*(secondCircleMiddleY-firstCircleMiddleY));

        if(distance < firstCircle반지름 + secondCircle반지름 ){
            System.out.println("원이 겹칩니다.");
        }
        else{
            System.out.println("원이 겹치겠냐고요 ㅋㅋ");
        }

        scanner.close();
    }
}
