package ex03;

//2중 중첩 for문을 사용하여 구구단을 출력하는 프로그램 작성

public class ex3_4 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++){
                System.out.println(i+"X"+j+"="+i*j);
            }
        }
    }
}
