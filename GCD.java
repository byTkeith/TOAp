public class GCD {
    public int GreatestCom(int m, int n){
        if (n==0){
            return m;//this is because the only greatest existing number will be m since we assume that one will always be greater than the other
        }
        else{ return GreatestCom(n,m% n);}
        
        //return 0;
    }
    
}
