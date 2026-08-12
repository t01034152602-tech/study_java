package ex1_multi_for.ex2_while;

import java.util.Random;

public class Ex5_do_while {
    public static void main(String[] args) {
        
        //자바,jsp, 안드로이드의 시험을 봤다
        //각 과목별 점수는 랜덤하게 0~130점이 대입
        //각 과목별 점수를 검사하여 
        //100점을 넘어가는 점수가 하나도 없을 때
        //최종 결과를 화면에 출력
        //-------------------------------------------------
        //자바 : 37
        //jsp : 100
        //안드로이드 : 13

        int i = 0;
        int j = 0;
        int a = 0;

        do{

            i = new Random().nextInt(131);
            j = new Random().nextInt(131);
            a = new Random().nextInt(131);
        
        }while( i > 100 || j > 100 || a > 100 );
        
        System.out.println(" 자바 : " + i);
        System.err.println("jsp : " + j);
        System.out.println( "안드로이드 : " + a);








    }//main
}
