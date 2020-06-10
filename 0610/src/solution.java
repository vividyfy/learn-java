public class solution {
    public static int findKth(int[] a, int n, int K) {
        return findKth2(a, 0,n-1, K);
    }

    private static int findKth2(int[] a, int left, int right, int k) {
        int index = partition(a, left, right);
        if (index - left + 1 == k) {
            return a[index];
        } else if (index - left + 1 > k) {
            return findKth2(a,left,index-1, k);
        } else {
            return findKth2(a, index + 1, right, k-index+left-1);
        }
    }

    private static int partition(int[] a, int left, int right) {
        int baseValue = a[left], i = left, j = right;
        while (i < j) {
            while (i < j && a[j] <= baseValue) {
                j--;
            }
            a[left] = a[right];
            while (j > i && a[i] >= baseValue) {
                i++;
            }
            a[right] = a[left];
        }
        a[left] = baseValue;
        return left;
    }

    public static void main(String[] args) {
        int[] a = {9,5,2,7,3,6,8};
        System.out.println(findKth(a, 7, 3));
    }
}
