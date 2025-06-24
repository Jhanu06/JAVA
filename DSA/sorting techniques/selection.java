
//selection sort

class selection{
    public static void main(String[] args) {
        int nums[] = {6,5,2,8,9,4};
        int t = 0;
        int n=nums.length;
        int min=-1;
        System.out.println("Before Sorting");
        for (int i : nums) {
            System.out.print(i+ " ");
        }
        System.out.println();

        // selection Sort with Iteration Printing
        for(int i=0;i<n-1;i++)
        {
            min=i;
            for(int j=i+1;j<n;j++)
            {
              if(nums[min]>nums[j])
              {
                min=j;      
              }
            }
            t=nums[min];
            nums[min]=nums[i];
            nums[i]=t;

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
