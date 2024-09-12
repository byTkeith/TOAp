import java.util.*;
public class Scoring {
    public int  ScoreCal(int index,int currentscore,int[] list, int t){
        if(index==list.length||currentscore>=t){
            return(currentscore<t)?currentscore:0;
        }
        int addScore = ScoreCal(index+1, currentscore+list[index], list, t);
        int MulScore = ScoreCal(index+1, currentscore*list[index], list, t);

        return Math.max(addScore, MulScore);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your values:\n");
        int n=sc.nextInt();
        int[] restOfValues= new int[n];//reads an arraylist the same amount as n

        for(int i=0; i<n;i++){
            restOfValues[i]= sc.nextInt();//read each number separately
        }
        int target=sc.nextInt();//takes the target

        Scoring scg=new Scoring();
        System.out.println(scg.ScoreCal(0, 1, restOfValues, target));
    }
}
