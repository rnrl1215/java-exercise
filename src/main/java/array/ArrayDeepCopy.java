package array;

import java.util.Arrays;

public class ArrayDeepCopy {
    public static void main(String[] args) {

        // shallow copy
        Integer[] arr1 = {1,2,3,4};
        Integer[] shallowCopy = arr1;

        shallowCopy[2] = 123;

        // arr, copy 값이 둘다 변경됨.
        System.out.println("=====Shallow Copy=====");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(shallowCopy));

        // deep copy
        Integer[] arr2 = {1,2,3,4};
        Integer[] deepCopy = new Integer[arr2.length];

        System.arraycopy(arr2, 0, deepCopy, 0, arr2.length);
        deepCopy[2] = 123;

        System.out.println("=====Deep Copy=====");
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(deepCopy));

        System.out.println("=====END=====");
    }
}
