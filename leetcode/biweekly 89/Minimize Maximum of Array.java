class Solution {
    public int minimizeArrayValue(int[] nums) {
        int sum = 0, maxIdx = 0;
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            if(nums[i] > nums[maxIdx]) maxIdx = i;
        }
        int result = sum / nums.length;
        if(maxIdx == 0) return nums[0];
        if(result * nums.length == sum) return result;
        else return result + 1;
    }
}