public class modulo {
    public int counter(int n, int z){
        int count=0;
        for(int x=1; x<n;x++){
            for(int y=1;y<n;y++){
                if((x*y)%n==z){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        modulo md= new modulo();
        System.out.println(md.counter(6, 3));
    }
}
