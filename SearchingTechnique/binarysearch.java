
// write a java class to search the array
    // using binary search algorithm
    public class binarysearch {
        public static void main(String[] args) {
            int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            int search = 7;
            int found = 0;
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == search) {
                    found = 1;
                    break;
                } else if (arr[mid] < search) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            if (found == 1) {
                System.out.println("Element found");
            } else {
                System.out.println("Element not found");
            }
        }
    }
