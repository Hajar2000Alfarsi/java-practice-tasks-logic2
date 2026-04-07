import java.sql.PreparedStatement;
import java.util.Scanner;

public class task24 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("write a number: ");
            int num = sc.nextInt();
            task24 ex24 = new task24();
            System.out.println(ex24.less20(num));

        }
        public boolean less20(int n){
            boolean result=false;
            if(n%20==18 || n%20==19){
                result=true;
            }else{
                result=false;
            }
            return result;
        }
}
