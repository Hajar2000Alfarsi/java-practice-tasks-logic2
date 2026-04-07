import java.util.Scanner;

public class task28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("write 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println("no Doubles (true/false): ");
        boolean noDoubles = sc.nextBoolean();
        task28 ex28 = new task28();
        System.out.println(ex28.withoutDoubles(num1,num2,noDoubles));

    }
    public int withoutDoubles(int die1, int die2, boolean noDoubles){
        int result=0;
        if( noDoubles == false ){
            result=die1 + die2;
        }else if(noDoubles == true &&  die1 != die2 ){
            result=die1 + die2;
        }else if ( noDoubles == true && die1 == die2){
            result=(die1 +1)+die2;
            if(result>6 ){
                result=1+die2;
            }
        }
        return result;
    }
}
