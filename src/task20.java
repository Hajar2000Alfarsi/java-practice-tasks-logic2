import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a first number: ");
        int first = sc.nextInt();
        System.out.println("write a second number: ");
        int second = sc.nextInt();

        task20 ex20 = new task20();
        System.out.println(ex20.shareDigit(first, second));


    }

    public boolean shareDigit(int a, int b) {
        int leftDigit_a=a/10;
        int rightDigit_a=a%10;
        int leftDigit_b=b/10;
        int rightDigit_b=b%10;
        boolean result=false;

        if(leftDigit_a==leftDigit_b){
            result=true;
        } else if (leftDigit_a==rightDigit_b) {
            result=true;
        } else if (rightDigit_a==leftDigit_b) {
            result=true;
        } else if (rightDigit_a==rightDigit_b) {
            result=true;
        }else{
            result=false;
        }
        return result;
    }
}
