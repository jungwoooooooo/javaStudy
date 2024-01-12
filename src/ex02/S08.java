package ex02;

import java.util.Scanner;

//8. 2차원 평면에서 직사각형은 문제 7번처럼 두 점으로 표현된다.
//        키보드로부터 사각형을 구성하는 두 점(x1, y1), (x2, y2)를 입력받아
//        100,100과 200,200의 두 점으로 이루어진 사각형과 충돌하는지 판별하는 프로그램을 작성하라.
//        (아래 코드를 참고하여 만드시오)
//
//        다음은 점(x,y)가 사각형 (rectx1, recty1), (rectx2, recty2) 안에 있으면 true를 리턴하는 메소드이다. 이를 활용하라.
//
//public static boolean inRect(int x, int y, int rectx1, int rectx2, int recty1, int recty2){
//        if ((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2))
//        { return true; }
//        else { return false; }
//        }

public class S08 {

    public static boolean inRect(int x, int y, int rectx1, int rectx2, int recty1, int recty2){
        if ((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2))
        { return true; }
        else { return false; }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("사각형을 구성하는 두 점(x1, y1), (x2, y2)를 입력하시오");

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        if (inRect(100,200,x1,x2,y1,y2) == true){
            System.out.println("사각형이 사용자가 입력한 사각형 안에 들어있음요 !");
        }
        else{
            System.out.println("사각형이 안에 들어있진 않고 ㅋㅋㅋ");
        }

        }

    }

