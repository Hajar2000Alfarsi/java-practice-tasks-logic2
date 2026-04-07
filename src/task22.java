import java.util.Scanner;

public class task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a number: ");
        int day = sc.nextInt();
        System.out.println("is 1VAcation:(true/false) ");
        boolean isVAcation = sc.nextBoolean();

        task22 ex22 = new task22();
        System.out.println(ex22.alarmClock(day, isVAcation));


    }

    public String alarmClock(int day, boolean vacation){
        String result="";
        if(day>=1 && day<=5 && vacation==false){
            result="7:00";
        } else if (day>=1 && day<=5 && vacation==true) {
            result="10:00";
        } else if (day==0 || day==6 && vacation==false) {
            result="10:00";
        }else if (day==0 || day==6 && vacation==false) {
            result="10:00";
        }else if (day==0 || day==6 && vacation==true) {
            result="return off";
        }
        return result;
    }
}
