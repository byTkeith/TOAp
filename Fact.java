import java.util.Scanner;

public class Fact {//npte the factors are N=1,2,4
    int value;
    public int Factor(int n){
        if(n==0|| n==1|| n==2){
            value=1;
            return value;
        }
        else if(n==3){
            value=2;
            return value;//there are only 2 ways to get an outcome {1,1,1} {3}
        }

        int sub1= Factor(n-1);
        int sub3= Factor(n-3);
        int sub4= Factor(n-4);
        value=sub1+sub3+sub4;


        return value;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the factor being searched for '0' to exit:\n");
        
        int input= scanner.nextInt();
        // while ((input!=0)) {
        //     System.out.println("Enter the factor being searched for '0' to exit:\n");
        //     input= scanner.nextInt();
        //     Fact fact = new Fact();
        //     System.out.println("the print value is :"+fact.Factor(input));
            
        // }
        Fact fact = new Fact();
        System.out.println("the print value is :"+fact.Factor(input));
        
    }
    
}
