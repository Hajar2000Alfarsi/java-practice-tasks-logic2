import java.util.Scanner;

public class task19 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("write a first number: ");
        int first=sc.nextInt();
        System.out.println("write a second number: ");
        int second=sc.nextInt();
        System.out.println("write a third number: ");
        int third=sc.nextInt();
        task19 ex19=new task19();
        System.out.println(ex19.redTicket(first,second,third));
    }

    public int redTicket(int a, int b, int c){
        int result=0;
        if(a==2 && b==2 && c==2){
            result=10;
        } else if (a==b && b==c && c==a) {
            result=5;
        } else if (a!=b && b!=c && a!=c) {
            result=1;
        }else{
            result=0;
        }
        return result;
    }
}
