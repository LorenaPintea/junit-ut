package springboot.junitut;

public class ArrayMethods {

    int getIndex(int[] arr, int value) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
            }
        }

        return index;
    }

    boolean numberExists(int[] arr, int value) {
        boolean exists = false;

        for (int i : arr) {
            if (i == value) {
                exists = true;
                break;
            }
        }

        return exists;
    }

    int[] reverseArray(int[] arr) {
        int[] reversedArr = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArr[arr.length - 1 - i] = arr[i];
        }

        return reversedArr;
    }

    void printElement(int[] arr, int value) {
        System.out.println(arr[value]);
    }
}
