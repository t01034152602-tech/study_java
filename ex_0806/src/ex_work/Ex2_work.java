package ex_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {
        
    //비교값으로 1월~ 12월 사이의 값을 키보드에서 입력
    //준비된 비교값에 해당하는 달이 몇일까지 있는지를 출력
    //----------------------
    //3월은 31일 까지 있습니다
        Scanner sc = new Scanner(System.in);

        System.out.print("월 : ");
        int d = sc.nextInt();
        int mouth = 12;

        //밑에 방법도 맞지만 모아서 처리가능 효율따지기
    switch ( d ) {
        case 1:
            System.out.println("1월은 31일까지 있음");
            break;
        case 2:
            System.out.println("2월은 28일까지 있음");
            break;
        case 3:
            System.out.println("3월은 31일까지 있음");
            break;
        case 4:
            System.out.println("4월은 30일까지 있음");
            break;
        case 5:
            System.err.println("5월은 31일까지 있음");
            break;
        case 6:
            System.out.println("6월은 30일까지 있음");
            break;
        case 7:
            System.out.println("7월은 31일까지 있음");
            break;
        case 8:
            System.out.println("8월은 30일까지 있음");
            break;
        case 9:
            System.out.println("9월은 31일까지 있음");
            break;
        case 10:
            System.out.println("10월은 30일까지 있음");
            break;
        case 11:
            System.out.println("11월은 31일까지 있음");
            break;
        case 12:
            System.out.println("12월은 30일까지 있음");
            break;
        default:
            System.out.println("없는 달 입니다");
            break;
    }
 



    }//main
}
