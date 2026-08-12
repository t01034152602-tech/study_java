package ex_work;

public class Ex1_work {
   public static void main(String[] args) {

      // 나이가 15세 이상이거나, 키가 150cm이상이면 탑승가능
      // 그렇지 않으면 탑승불가를 출력

      int age = 14;
      int cm = 160;

      String res = "";
      if (age >= 15 || cm >= 150) {
         res = "탑승가능";

      } else {
         res = "탑승불가";
      }

      System.out.println(res);
      //위의 문제를 삼항연산자로 바꿧을때 !
      // 삼항연산자
      int a = 17;
      int b = 140;
      res = "";
      res = a >= 15 || b >= 150 ? "탑승가능" : "탑승불가";
      System.err.println(res);

   }
}
