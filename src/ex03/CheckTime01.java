package ex03;

//2중 중첩을 사용하여 오른쪽과 같이 출력되도록 for, while, do-while 문으로 각각 프로그램을 작성하라.

public class CheckTime01 {
    //do while 문 사용
    public static void main(String[] args) {
        int i = 0;
        int j = 5;

        do{
            do{
                System.out.print("*");
                j--;
            }while(j>i);
            System.out.println();
                i++;
                j=5;
        }while(i<5);
    }
    
//while 문 사용
//    public static void main(String[] args) {
//        int i = 0;
//        int j = 5;
//
//        while(i<5){
//            while(j > i){
//                System.out.print("*");
//                j--;
//            }
//            System.out.println();
//            i++;
//            j = 5;
//        }
//    }
    
    //for 사용
//    public static void main(String[] args) {
//
//        for(int i=0; i<5 ; i++){
//            for(int j =5 ; j>i ;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
}
