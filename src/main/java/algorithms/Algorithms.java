package algorithms;

import java.util.ArrayList;

/**
 * Created by wangmo on 16/9/18.
 */
public class Algorithms {

    public static void quicksort(Comparable[] array, int start, int end){
        int pos = partition(array, start, end);
        if(start < pos-1) quicksort(array, start, pos-1);
        if(pos+1 < end) quicksort(array, pos+1, end);
    }

    private static int partition(Comparable [] array, int start, int end){
        if(start == end) return start;
        int i = start;     //
        int j = start + 1;
        Comparable pivot = array[start];
        while (j <= end) {
            if (array[j].compareTo(pivot) < 0) {
                // swap i+1 and j, inc i,j
                Comparable temp = array[i+1];
                array[i+1] = array[j];
                array[j] = temp;
                i++;
                j++;
            } else {
                j++;
            }
        }
        // swap start,i
        Comparable temp = array[i];
        array[i] = array[start];
        array[start] = temp;
        return i;
    }


    // Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

//    For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.

    public int numSquares(int n) {

        return 0;
    }

    public static boolean Find(int target, int [][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) return false;
        int row = array.length;
        int col = array[0].length;
        int lo = 0;
        int hi = col - 1;
        int mid = 0;
        for (int i = 0; i < row; i++) {
            while (lo <= hi) {
                mid = (lo + hi) / 2;
                if (target == array[i][mid]) {
                    return true;
                } else if (target > array[i][mid]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
            if (array[i][mid] > target) {
                mid = mid - 1;
                if (mid < 0) return false;
            }
            lo = 0;
            hi = mid;
        }
        return false;
    }

    public String replaceSpace(StringBuffer str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toString().toCharArray()) {
            if (c == ' ') {
                result.append("%20");
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) return new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        while (listNode != null) {
            values.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> result = new ArrayList<>(values.size());
        for (int i = values.size()-1; i >= 0; i--) {
            result.add(values.get(i));
        }
        return result;
    }

    public static void main(String []args){
        int [][]array = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(Find(0,array));
    }

}
