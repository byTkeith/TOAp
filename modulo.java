import java.util.*;
public class modulo {
    int count=0;//count to keep track of values that can pair
    public int Mod(int n, int z){
        //Random rm= new Random();
      
        for(int x=1;x<=n;x++){
            for(int y=1;y<n;y++){
                if((x*y)%n==z & n>z & z>=0){
                    count++;
                }

            }

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N and Z on separate lines:\n");
        int inputN=sc.nextInt();
        int inputZ=sc.nextInt();
        modulo md=new modulo();
        System.out.println(md.Mod(inputN, inputZ));
    }
    
}
