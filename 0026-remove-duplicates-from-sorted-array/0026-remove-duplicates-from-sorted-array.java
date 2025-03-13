class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k=1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // If a new unique element is found
                nums[k] = nums[i]; // Move it to the correct position
                k++; // Increment unique count
            }
        }
        return k;
    }
}
