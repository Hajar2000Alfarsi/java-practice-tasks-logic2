import java.util.Scanner;

public class task18 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("write a first number: ");
        int first=sc.nextInt();
        System.out.println("write a second number: ");
        int second=sc.nextInt();
        System.out.println("write a third number: ");
        int third=sc.nextInt();
        task18 ex18=new task18();
        System.out.println(ex18.lessBy10(first,second,third));
    }

    public boolean lessBy10(int a, int b, int c){
        boolean result=false;
        if(Math.abs(a-b)>=10 || Math.abs(a-c)>=10 || Math.abs(b-c)>=10){
            result=true;
        }else{
            result=false;
        }
        return result;
    }
}
