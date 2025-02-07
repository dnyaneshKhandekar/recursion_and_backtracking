package Linear_Search;
import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,67, 4, 6, 2, 12,67, 45, 67, 89};
        int target = 67;

        boolean isTarget = checkTarget(arr, 0, target);
        System.out.println(isTarget);

        findAllIndex(arr, 0, target);
        System.out.println(list.toString());

//        System.out.println(isTarget);
//        ArrayList<Integer> list2 = new ArrayList<>();
//        System.out.println( findAllIndex2(arr, 0, target,list2).toString() );
        System.out.println( findAllIndex2( arr, 0, target, new ArrayList<>() ).toString() );
    }

    //  checking target is consist or not
    static boolean checkTarget(int[] arr, int i, int target) {
        if (i == arr.length) {
            return false;
        }

        if(arr[i] == target) {
            return true;
        } else {
            return checkTarget(arr, i+1, target);
        }

    }

    // checking multiple occurrences of target element

    // method 1 to return multiple index of occurrences of an target element
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex (int[] arr, int i, int target) {
        if (i == arr.length) {
            return;
        }

        if(arr[i] == target) {
            list.add(i);
        }
        findAllIndex(arr, i+1, target);


    }

    // method 2
    static ArrayList<Integer> findAllIndex2 (int[] arr, int a, int target, ArrayList<Integer> list2) {
        if (a == arr.length) {
            return list2;
        }

        if(arr[a] == target) {
            list2.add(a);
        }
        return findAllIndex2(arr, a +1, target, list2);

    }


}