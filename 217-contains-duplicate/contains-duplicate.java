class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums); // step 1

        for (int i = 1; i < nums.length; i++) { // start from 1
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}