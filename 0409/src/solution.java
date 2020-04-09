public class solution {
    public int searchInsert(int[] nums, int target) {
        int j = 0;
        for(int i = 0; i < nums.length;i++) {
            if(nums[i] == target) {
                return i;
            }else {
                if(nums[i] < target) {
                    nums[j] = nums[i];
                    j++;
                }
            }

        }
        return j;
    }
}
