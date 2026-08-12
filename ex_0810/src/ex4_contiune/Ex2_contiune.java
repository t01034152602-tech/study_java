package ex4_contiune;

public class Ex2_contiune {
    public static void main(String[] args) {
        



        for( int i = 1; i <= 2; i++){

            for( int j = 1; j <= 5; j++){

               switch( i ){
                    case 1: 
                    System.out.print("case 1");
                    break;

                    case 2:
                        System.out.println("case 2");
                        continue;
               }

                System.out.print("결과 : ");
            }//inner

            System.out.println();


    }
}
