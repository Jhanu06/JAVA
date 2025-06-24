
//insertion sort

class insertion{
    public static void main(String[] args) {
        int nums[] = {2,8,6,3,1};
        int t = 0;
        int n=nums.length;
        System.out.println("Before Sorting");
        for (int i : nums) {
            System.out.print(i+ " ");
        }
        System.out.println();

        // insertion Sort with Iteration Printing
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) { // ascending order
                    // Swap
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                } else {
                    break; // Already in correct place
                }
            }

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
