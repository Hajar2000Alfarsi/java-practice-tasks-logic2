import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a number: ");
        int first = sc.nextInt();
        System.out.println("is summer:(true/false) ");
        boolean isSummer = sc.nextBoolean();

        task21 ex21 = new task21();
        System.out.println(ex21.squirrelPlay(first, isSummer));


    }

    public boolean squirrelPlay(int temp, boolean isSummer){
        boolean result=false;
        if(isSummer==false && temp>=60 && temp<=90){
            result=true;
        } else if (isSummer==true && temp>=60 && temp <=100) {
            result=true;
        }else{
            result=false;
        }
        return result;
    }
}
