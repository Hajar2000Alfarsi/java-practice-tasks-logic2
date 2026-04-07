import java.util.Scanner;

public class task27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("write 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println("write 3rd number: ");
        int num3 = sc.nextInt();
        System.out.println("equal OK (true/false): ");
        boolean equalOk = sc.nextBoolean();
        task27 ex27 = new task27();
        System.out.println(ex27.inOrderEqual(num1,num2,num3,equalOk));

    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk){
        boolean result=false;
        if(equalOk==false && a<b && b<c){
            result=true;
        }else if(equalOk==true && a <= b && b <= c ){
            result=true;
        }else {
            result=false;
        }
        return result;
    }
}
