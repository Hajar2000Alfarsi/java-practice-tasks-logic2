import java.util.Scanner;

public class task26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a number: ");
        int num = sc.nextInt();
        task26 ex26 = new task26();
        System.out.println(ex26.fizzString2(num));

    }
    public String fizzString2(int n){
        String result="";
        if(n%3==0 && n%5==0){
            result="FizzBuzz!";
        } else if (n%3==0) {
            result="Fizz!";
        } else if (n%5==0) {
            result="Buzz!";
        }else {
            result=n+"!";
        }
        return result;
    }
}
