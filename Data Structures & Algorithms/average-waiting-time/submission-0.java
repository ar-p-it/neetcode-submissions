class Solution {
    public double averageWaitingTime(int[][] customers) {
        
        int currentTime=0;
        double waiting=0;

        for(int[]customer:customers){
            currentTime=Math.max(customer[0],currentTime)+customer[1];
            waiting+=currentTime-customer[0];
        }
        return waiting/customers.length;
    }
}