class Solution {
    public int search(int[] nums, int target) {
        int leftIdx = 0;
        int rightIdx = nums.length;

        while (leftIdx < rightIdx) {
            int midIdx = leftIdx + (rightIdx - leftIdx) / 2;
            int midItem = nums[midIdx];

            if (target == midItem) {
                return midIdx;
            }

            if (target < midItem) {
                rightIdx = midIdx;
            }

            if (target > midItem) {
                leftIdx = midIdx + 1;
            }
        }

        return -1;
    }
}