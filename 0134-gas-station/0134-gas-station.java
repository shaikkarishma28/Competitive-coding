class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;
        int currentTank = 0;
        int startStation = 0;
        
        for (int i = 0; i < gas.length; i++) {
            int gain = gas[i] - cost[i];
            totalTank += gain;
            currentTank += gain;
            
            // If current tank is negative, reset start point
            if (currentTank < 0) {
                startStation = i + 1;
                currentTank = 0;
            }
        }

        return totalTank >= 0 ? startStation : -1;
    }
}