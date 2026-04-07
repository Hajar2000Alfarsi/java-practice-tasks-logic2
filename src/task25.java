import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is Morning: (true/false");
        boolean isMorning = sc.nextBoolean();
        System.out.println("Is Mon: (true/false");
        boolean isMon = sc.nextBoolean();
        System.out.println("Is sleep: (true/false");
        boolean isAsleep = sc.nextBoolean();
        task25 ex25 = new task25();
        System.out.println(ex25.answerCell(isMorning,isMon,isAsleep));

    }
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep){
        boolean result = false;
        if(isAsleep==true){
            result=false;
        } else if (isMorning==true && isMom==true) {
            result=true;
        } else if (isMorning==false) {
            result=true;
        }
        return result;
    }
}
