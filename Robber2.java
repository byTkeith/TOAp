public class Robber2 {
    private int maxValueRobber(int[] houses, int currentindex){//the hose list is {6,7,1,30,8,2,4}
        if(currentindex>=houses.length){
            return 0;
        }
        int currentHouse= houses[currentindex]+maxValueRobber(houses, currentindex+2);
        int skippedHouse= maxValueRobber(houses, currentindex+1);
        return Math.max(currentHouse, skippedHouse);
    }
    public int NetHouse(int[] houses){
        return maxValueRobber(houses, 0);
    }
    
}
