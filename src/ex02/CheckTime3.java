package ex02;

//i가 6의 배수인 경우 "6의 배수"를, i가 홀수인 경우 "홀수"라고 출력하며 그 외 경우는 아무것도 출력되지 않게 하고자 함 어떻게 수정해야 할까
public class CheckTime3 {
    public static void main(String args[]){
//        int i=4;
//        if(i%2 == 0)
//            if(i%3 == 0)
//                System.out.println("6의 배수");
//        else
//            System.out.println("홀수");

        //내가 생각한 1번 방법
        int i =6;

        if(i%2 ==0 && i%3 == 0){
            System.out.println("6의 배수");
        }
        else{
            System.out.println("홀수");
        }



    }
}
