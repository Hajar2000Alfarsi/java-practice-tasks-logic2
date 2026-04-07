import java.util.Scanner;

public class task16 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("write a string: ");
        String str=sc.next();
        task16 ex16=new task16();
        System.out.println(ex16.fizzString(str));
    }
    public String fizzString(String str){
        String result = "";
        if(str.startsWith("f")&&str.endsWith("b")) {
            result = "FizzBuzz";
        }else if (str.startsWith("f")){
            result = "Fizz";
        }else if(str.endsWith("b")){
            result="Buzz";
        }
        return result;
    }
}
