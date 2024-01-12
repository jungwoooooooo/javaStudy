package ex02;

import java.util.Scanner;

//7. 2차원 평면에서 직사각형은 왼쪽 상단 모서리와 오른쪽 하단 모서리의 두 점으로 표현한다.
//        100,100과 200,200의 두 점으로 이루어진 사각형이 있을 때 Scanner를 이용하여
//        정수 x와 y 값을 입력받고 점 (x,y)가 이 직사각형 안에 있는 지를 판별하는 프로그램을 작성하라.
//
//        점 (x,y)의 좌표를 입력하시오 >> 150 150(150,150)은 사각형 안에 있습니다.

//내가 생각한 풀이 :
//        (100,100) 과 (200,200) 사이에 있어야 하니
//        x는 100이상 200이하에 있어야 한다.
//        y도 마찬가지 고고

public class S07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("점 (x,y)의 좌표를 입력하시오");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if(100<=x && x<=200){
            if(100<=y && y<=200){
                System.out.println(x +" " + y + "("+x+","+y+")은 사각형 안에 있습니다");
            }
            else{
                System.out.println("범위를 벗어났소");
            }
        }
        else{
            System.out.println("범위를 벗어났소");
        }

    }
}
