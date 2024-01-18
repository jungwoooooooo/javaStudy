package ex03;

//2차원 배열에 학년별로 1,2학기 성적으로 저장하고, 4년간 전체 평점 평균을 출력하라.

public class ex3_10 {
    public static void main(String[] args) {
        double score[][]={
                {3.1,3.2},
                {2.1,2.8},
                {4.1,3.9},
                {2.1,4.2}
        };

        double sum = 0;

        for(int year=0;year<score.length;year++){
            for(int term=0;term<score[year].length;term++){
                sum+=score[year][term];
            }
        }

        int a = score.length;
        int b = score[0].length;

        System.out.println("4년간 전체 평점 평균 : "+sum/(a*b));

    }
}
