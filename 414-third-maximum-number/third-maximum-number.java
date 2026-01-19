import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums); // ascending order
        int n = nums.length;
        int count = 1; // count of distinct numbers from largest
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1]) {
                count++;
            }
            if (count == 3) {
                return nums[i];
            }
        }
        // if less than 3 distinct numbers, return maximum
        return nums[n - 1];
    }
}
