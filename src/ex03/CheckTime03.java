package ex03;

import java.util.Scanner;

//1.10개의 정수를 저장하는 배열 tenArray을 선언하고 생성하는 코드를 작성하라.
//2. 배열 tenArray의 크기를 어떻게 알아낼 수 있는가?
//3. 배열 tenArray에 1~10까지 저장한 뒤, 모든 원소의 값을 더하여 출력하는 프로그램을 작성하라.
public class CheckTime03 {
    public static void main(String[] args) {
        int tenArray[] = new int[10];
        int sum = 0;
        //2
        System.out.println("tenArray의 크기는 = " +tenArray.length);
        //3
        for(int i=0;i<10;i++){
            tenArray[i] = i+1;
            sum+=tenArray[i];
        }
        System.out.println("모든 원소의 값을 더한 값 : " + sum);
    }
}
