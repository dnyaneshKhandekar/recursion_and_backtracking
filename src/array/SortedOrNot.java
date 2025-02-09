package array;

public class SortedOrNot {

    static boolean sortingCheck(int[] arr) {
        if (arr.length == 1) {
            return true;
        }
        return helper(arr, 0, 1);
    }

    static boolean helper(int[] arr, int s, int e) {
        if (e == arr.length) { // Base case: reached the end
            return true;
        }
        if (arr[s] > arr[e]) { // If any pair is out of order
            return false;
        }
        return helper(arr, s + 1, e + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 7, 9}; // Sorted array
        System.out.println(sortingCheck(arr)); // true

        int[] arr2 = {1, 2, 3, 4, 9, 6, 7, 7, 9}; // Unsorted array
        System.out.println(sortingCheck(arr2)); // false
    }
}

