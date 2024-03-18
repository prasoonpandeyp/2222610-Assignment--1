
// write a java class to search the array
// using Hashing search algorithm

public class Hashing {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 54, 2, 3 };
        int n = arr.length;
        int x = 3;
        int result = search(arr, n, x);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + result);
    }

    static int search(int[] arr, int n, int x) {
        int i = 0;
        while (i < n) {
            if (arr[i] == x)
                return i;
            i = i + 1;
        }
        return -1;
    }
}
