package ex03;
//for문을 이용하여 1에서 10까지 덧셈으로 표시하고 합을 출력하라.
public class ex3_1 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i<=10 ; i++){
            sum += i;
        }
        System.out.println("1부터 10까지 더한 합 : "+sum);
    }
}
