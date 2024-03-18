
// write a java code to search the array
    // using InterPolation search algorithm
    
        public class InterpolationSearch {
            public static void main(String[] args) {
                int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
                int search = 7;
                int found = 0;
                int start = 0;
                int end = arr.length - 1;
                while (start <= end && search >= arr[start] && search <= arr[end]) {
                    int pos = start + (((end - start) / (arr[end] - arr[start])) * (search - arr[start]));
                    if (arr[pos] == search) {
                        found = 1;
                        break;
                    } else if (arr[pos] < search) {
                        start = pos + 1;
                    } else {
                        end = pos - 1;
                    }
                }
                if (found == 1) {
                    System.out.println("Element found");
                } else {
                    System.out.println("Element not found");
                }
            }
        }
    