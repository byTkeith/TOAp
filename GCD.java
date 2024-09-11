import java.util.*;
public class GCD {
    public int GreatestCom(int m, int n){
        if (n==0){
            return m;//this is because the only greatest existing number will be m since we assume that one will always be greater than the other
        }
        else{ return GreatestCom(n,m% n);}
        
        //return 0;
    }
    public static void main(String[] args) {
        GCD gc= new GCD();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the two number values split by space:\n");
        String input= sc.nextLine();
        String[] tvalues = input.split(" ");
        int t1= Integer.parseInt(tvalues[0]);//the first number
    }
    
}
