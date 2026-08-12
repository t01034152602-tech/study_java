package ex3_scanner;

import java.util.Scanner;

public class Ex1_scanner {
    public static void main(String[] args) {

        // 키보드에서 값을 받기위한 Scanner객체
        Scanner sc = new Scanner(System.in);
        //ln
        System.out.print("정수 : ");
        int n = sc.nextInt();
        System.out.println("값" + n);

        System.out.println("문자열: ");
        int s = sc.nextInt();
        System.out.println("값" + s);
        
        

    }// main
}
