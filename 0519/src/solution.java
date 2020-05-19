public class solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return;
        }
        int stop1 = 0;
        int stop2 = len;
        int i = 0;
        while (i < stop2) {
            if (nums[i]==0) {
                swap(nums, i, stop1);
                stop1++;
                i++;
            } else if (nums[i]==1) {
                i++;
            } else {
                swap(nums, i, stop2);
                stop2--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


}
