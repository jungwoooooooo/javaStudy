package ex03;

import java.util.Scanner;

//"exit"이 입력되면 while 문을 벗어나도록 break 문을 활용하는 프로그램을 작성하라.
public class ex3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("exit를 입력하면 while문에서 벗어납니다.");

        while(true){
            String a = scanner.next();

            if(a.equals("exit")){
                break;
            }
        }
    }
}
