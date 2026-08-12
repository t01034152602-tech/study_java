package ex_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        
        //수1 : 10
        //수2 : 20
        //연산자 : +
        //10 + 20 = 30

        Scanner sc = new Scanner( System.in );
        System.out.print("수1 : ");
        int a = sc.nextInt();

        System.out.print("수2 : ");
        int b = sc.nextInt();

        System.out.println("연산자 : ");
        String op = sc.next();

        switch( op ){//비교값

            case "+":
                System.out.println( a + "+" + b + "=" + (a + b));
                break;
            case "-":
                System.out.println( a + "-" + b + "=" + (a - b));
                break;
            case "*":
                System.out.println( a + "*" + b + "=" + (a * b));
                break;
            case "/":
                System.out.println( a + "/" + b + "=" + ((float)a / b));
                break;
            default:
                System.out.println("연산자 오류");
                break;
        }//switch
        
        
        





    }//main
}
