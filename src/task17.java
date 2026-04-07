import java.util.Scanner;

public class task17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("write a first number: ");
        int first=sc.nextInt();
        System.out.println("write a second number: ");
        int second=sc.nextInt();
        System.out.println("write a third number: ");
        int third=sc.nextInt();
        System.out.println("write a third number: ");
        boolean bol=sc.nextBoolean();
        task17 ex17=new task17();
        System.out.println(ex17.inOrder(first,second,third,bol));
    }

    public boolean inOrder(int a, int b, int c, boolean bOk){
        boolean result=false;
        if(bOk==false && b>a && c>b){
            result=true;
        }else if(bOk==true && c>b){
            result=true;
        }else {
            result=false;
        }
        return result;
    }
}
