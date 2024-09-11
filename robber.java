public class robber {
    private int HouseRobber(int[] houses, int currentindex){

        if(currentindex>=houses.length){
            return 0;
        }

        int firstHouse=houses[currentindex]+HouseRobber(houses, currentindex+2);
        int secondHouse=houses[currentindex]+HouseRobber(houses, currentindex+1);
        return Math.max(firstHouse,secondHouse);
    }
    public int maxMoney(int[] houses){
        return HouseRobber(houses, 0);
    }

    public static void main(String[] args) {
        
    }
    
}
