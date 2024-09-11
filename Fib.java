import java.util.Scanner;

public class Fib {
    public int Fibonnaci(int n){
        return 0;
    }

    }
    public static void main(String[] args) {
        System.out.println("Enter the number that you want to operate:");
        Scanner scanner= new Scanner(System.in);
        int input=scanner.nextInt();//records the value
        Fib fib =new Fib();
        fib.Fibonnaci(input);
        System.out.println("the value is :"+fib.Fibonnaci(input));
        
    }
    
}
