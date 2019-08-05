class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        nums1[m] = Integer.MAX_VALUE;
        int[] arr2 = new int[nums2.length + 1];
        int x = 0;
        for (; x < n; x++) {
            arr2[x] = nums2[x];
        }
        arr2[x] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr3 = new int[nums1.length];
        while (k < arr3.length) {
            if (arr2[j] < nums1[i]) {
                arr3[k] = arr2[j];
                j++;
            } else {
                arr3[k] = nums1[i];
                i++;
            }
            k++;

        }
        for (int p = 0; p < nums1.length; p++) {
            nums1[p] = arr3[p];
        }

    }
}