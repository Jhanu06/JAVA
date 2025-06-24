public class merge {
    public static void main(String[] args) {
        int[] arr = {9, 7, 5, 11, 12, 2};
        
        mergeSort(arr, 0, arr.length - 1);
        
        // Print the sorted array
        System.out.println("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // MergeSort function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point of the array
            int mid = (left + right) / 2;
            
            // Recursively sort the two halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            
            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge two halves of the array
    public static void merge(int[] arr, int left, int mid, int right) {
        // Find the sizes of the two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        // Create temporary arrays for the two halves
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        
        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }
        
        // Merge the temporary arrays back into the original array
        int i = 0, j = 0;
        int k = left;
        
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        
        // Copy the remaining elements of leftArray, if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        
        // Copy the remaining elements of rightArray, if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
        
       
    }
}
