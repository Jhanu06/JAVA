
//bubble sort

class bubble {
    public static void main(String[] args) {
        int nums[] = {8,6,9,2,4,5};
        int t = 0;
        
        System.out.println("Before Sorting");
        for (int i : nums) {
            System.out.print(i+ " ");
        }

        System.out.println();

        // Bubble Sort with Iteration Printing
        for (int i = 0; i < nums.length-1; i++) {
            System.out.println("Iteration " + (i + 1) + ":");
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    t = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = t;
                }
            }
            // Print array after each iteration
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println("\n");
        }

        System.out.println("After Sorting");
        for (int i : nums) { 
            System.out.print(i + " ");
        }
    }
}
