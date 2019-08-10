import java.util.*;

import sun.security.util.Length;

class NumArray {

    int[] arr;
    int[] tree;

    public NumArray(int[] nums) {
        this.arr = nums;
        this.tree = new int[nums.length * 2];
        buildtree(arr, tree, 0, arr.length - 1, 1);

    }

    public void buildtree(int[] arr, int[] tree, int start, int end, int treenode) {
        if (start == end) {
            tree[treenode] = arr[start];
            return;
        }
        int mid = (start + end) / 2;
        buildtree(arr, tree, start, mid, treenode * 2);
        buildtree(arr, tree, mid + 1, end, treenode * 2 + 1);
        tree[treenode] = tree[treenode * 2] + tree[treenode * 2 + 1];
    }

    public void update(int i, int val) {
        update(arr, tree, 0, arr.length - 1, 1, i, val);

    }

    public void update(int[] arr, int[] tree, int start, int end, int treenode, int index, int val) {
        if (start == end) {
            arr[start] = val;
            tree[treenode] = val;
            return;
        }
        int mid = (start + end) / 2;
        if (index > mid) {
            update(arr, tree, mid + 1, end, treenode * 2 + 1, index, val);
        }
        else {
            update(arr, tree, start, mid, treenode * 2, index, val);
        }
        tree[treenode] = tree[treenode * 2] + tree[treenode * 2 + 1];        

    }

    public int sumRange(int i, int j) {
       return sumRange(tree, 0, arr.length, 1, i, j);

    }

    public int sumRange(int[] tree, int start, int end, int treenode, int left, int right) {

        if (left > end || right < start) {
            return 0;
        }

        if (start >= left && end <= right) {
            return tree[treenode];
        }
        
        int mid = (start + end) / 2;
        int ans1 = sumRange(tree, start, mid, treenode * 2, left, right);
        int ans2 = sumRange(tree, mid + 1, end, treenode * 2 + 1, left, right);
        return ans + ans2;

    }
}
