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
                swap(nums[i],nums[stop1]);
                stop1++;
                i++;
            } else if (nums[i]==1) {
                i++;
            } else {
                swap(nums[stop2],nums[i]);
                stop2--;
                i++;
            }
        }
    }

    private void swap(int num, int num1) {
        int tmp = num;
        num = num1;
        num1 = tmp;
    }
}
