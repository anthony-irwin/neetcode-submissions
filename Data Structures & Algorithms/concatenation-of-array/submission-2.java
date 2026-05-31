class Solution {
    public int[] getConcatenation(int[] nums) {
        int newCapacity = 2 * nums.length;
        int[] ans = new int[newCapacity];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }

        for (int i = nums.length; i < newCapacity; i++) {
            ans[i] = nums[i - nums.length];
        }
        return ans;
    }
}