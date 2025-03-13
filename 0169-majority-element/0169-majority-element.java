class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num; // Set a new candidate
            }
            count += (num == candidate) ? 1 : -1; // Increase or decrease count
        }

        return candidate;
    }
}