import java.util.Scanner;

public class task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a number: ");
        int num = sc.nextInt();
        task23 ex23 = new task23();
        System.out.println(ex23.specialEleven(num));

    }
    public boolean specialEleven(int n){
        boolean result=false;
        if(n%11==0 || n%11==1){
            result=true;
        }else {
            result=false;
        }
        return result;
    }
}
