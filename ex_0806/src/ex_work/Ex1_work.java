package ex_work;

public class Ex1_work {
    public static void main(String[] args) {
        
        //나이가 15세 이상이거나, 키가 150cm이상이면 탑승가능
        //그렇지 않으면 탑승불가를 출력

        int age = 14;
        int cm = 160;
        
        String res = "";
         if( age >= 15 || cm >= 150){
            res = "탑승가능";

         }else{
            res = "탑승불가";
         }

         System.out.println(res);

         //삼항연산자
         
        


    }
}
