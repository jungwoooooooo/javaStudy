package ex02;

import java.util.Scanner;

//9. 원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받아라.
//        그리고 실수 값으로 다른 점 (x.y) 을 입력받아 이 점이 원의 내부에 있는지 판별하여 출력하라.
//
//        원의 중심과 반지름 입력>> 10 10 6.5
//        점 입력>> 13 13
//        점 (13.0,13.0)은 원 안에 있습니다.
//
//        ※ 중심에서 점 ( x,y ) 사이의 거리가 반지름보다 작거나 같으면 원의 내부에 있다.
//        변수 x에 대한 제곱근의 값은 Math.sqrt(x)를 이용하면 된다. (Math함수는 6장 참고)
//        ※ Math.sqrt : 제곱근(루트) 값을 계산해주는 함수
//
//        ※ 원의 중심과 점의 거리가 반지름 길이와 같거나 작아야 합니다. √(x2-x1)2 + (y2-y1)2 , 원의 넓이 = 반지름2 *원주

public class S09 {

    static double getDistance(double x, double y, double x1, double y1) {
        // Math.pow() <- 제곱
        // Math.sqrt() <- 루트
        double d;
        int xd, yd;
        yd = (int) Math.pow((y1-y),2);
        xd = (int) Math.pow((x1-x),2);
        d = Math.sqrt(yd+xd);
        return d;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("원의 중심과 반지름 입력 >> ");
        double 원의중심x = scanner.nextDouble();
        double 원의중심y = scanner.nextDouble();
        double 반지름 = scanner.nextDouble();

        System.out.println("점 입력");
        double 점x = scanner.nextDouble();
        double 점y = scanner.nextDouble();

        if(getDistance(원의중심x, 원의중심y,점x,점y) <= 반지름){
            System.out.println("원이 내부에 있다");
        }
        else{
            System.out.println("원이 내부에 있겠냐 ㅋㅋ");
        }
    }
}
