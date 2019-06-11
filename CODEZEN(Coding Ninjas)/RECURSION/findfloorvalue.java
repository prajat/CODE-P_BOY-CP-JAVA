import java.util.*;
/**
 * findfloorvalue
 */
public class findfloorvalue {

    public static int findFloor(int[] array, int element) {
        return binarysearch(array, 0, array.length, element);

    }

    public static int binarysearch(int[] array, int left, int right, int element) {
        if (element < array[left]) {
            return -1;
        }
        if (array[right] <= element) {
            return array[right];
        }
        int mid = (right + left) / 2;
        if (mid == left) {
            return array[left];
        }

        if (array[mid] == x) {
            return array[mid];
        }
        else if(array[mid]<x)
        {
            return binarysearch(array, mid, right, element);
        }
        else {
            return binarysearch(array, left, mmid - 1, element);
        }
        
    }
}