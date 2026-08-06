package ex1_statement;

public class Ex1_if {
    public static void main(String[] args) {
        
        //제어문 - 프로그램의 흐름을 제어하는 문장
        //분기문과 반복문으로 나뉜다
        //분기문 : if, switch
        //반복문 : for, while, do-while

        //if문
        //if(조건식){
        // 조건식이 참일 때 실행되는 영역
        //}

        int n = 49; // 변수 n에 49를 저장

        // String은 쌍따옴표 안에 여러글자(문자열)을 저장하기 위한 자료형
        String str = ""; // 문자열 변수를 빈 문자열로 초기화

        // n이 50과 같은지 비교
        if( n == 50){
            str = "n은 50입니다"; // n이 50이면 해당 문자열 대입
        }

        // n이 50과 같지 않은지 비교
        if( n != 50 ){
            str = "n은 50이 아닙니다"; // n이 50이 아니면 해당 문자열 대입
        }

        System.out.println(str); // 결과 문자열 출력

    }
}
