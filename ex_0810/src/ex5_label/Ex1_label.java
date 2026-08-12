package ex5_label;
    
public class Ex1_label {
        
    //특정 반복문에 label을 붙여
    //한번에 두개 이상의 반복문을 제어할 수 있다
    out:for( int i = 1; i <= 3; i++){

        for( int j = 1; j <= 10; j++){

            if( j % 2 == 0)
                break;

            system.out.print(j + " ")
            }//inner

    }//outer

}   
