import java.util.*;

class Solution1 {
    public void moveZeroes(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                list.add(nums[i]);
            } else {
                count++;
            }

        }
        int[] arr = new int[list.size() + count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);

        }
        nums = arr;

    }
}

class Solution2 {
    public void moveZeroes(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
