public class QuickSort {
    public static void main(String[] args) {
        int a[] = {9, 7, 5, 11, 12, 2};
        
        quicksort(a, 0, a.length - 1);
        
        // Print sorted array
        System.out.println("Sorted Array: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void quicksort(int[] a, int low, int high) {
        while (low < high) {
            int pivot = a[low];  // Pivot element (start of the array)
            int i = low;  // i starts at low
            int j = high; // j starts at high
            int t = 0;

            // Partition the array around the pivot
            while (i < j) {
                // Move i to the right until we find an element greater than pivot
                while (a[i] <= pivot && i < high) {
                    i++;
                }
                // Move j to the left until we find an element smaller than pivot
                while (a[j] > pivot) {
                    j--;
                }

                // If i is less than j, swap the elements at i and j
                if (i < j) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }

            // Swap pivot with element at position j (placing pivot in correct position)
            t = a[low];
            a[low] = a[j];
            a[j] = t;

            // Print the array after each iteration (step)
            System.out.println("After partitioning (pivot " + a[j] + "): ");
            for (int k : a) {
                System.out.print(k + " ");
            }
            System.out.println();

            // Now process the two partitions
            // Only recurse if there are more than 1 element in sub-array
            if (j - 1 > low) {
                quicksort(a, low, j - 1);  // Left subarray
            }
            if (j + 1 < high) {
                quicksort(a, j + 1, high); // Right subarray
            }

            // Once both subarrays are sorted, break out of the loop
            break;
        }
    }
}
