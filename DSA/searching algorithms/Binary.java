
// binary search

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter length of an array : ");
        int n=x.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        { 
            a[i]=x.nextInt();
            System.out.println("The Array elements are:" + a[i]);
        }
        int target=24;
        //int res=Binarysearch(a,target);
        int low=0;
        int high=n-1;
        int res=Binarysearch(a,target,0,n-1);
       if(res!=-1)
       {
        System.out.println("the element found at index " + res);
       }
       else{
        System.out.println("the element not found ");
       }

    }
    // public static int Binarysearch(int[] a, int target) {
    //     int n=a.length;
    //     int low=0;
    //     int high=n-1;
    //     int mid=(low+high)/2;
    //     int steps=0;
    //    while(low<=high)
    //     {   steps++;
    //         if(a[mid]==target)
    //         {   
    //             System.out.println("steps taken by Binary search : "+steps);
    //             return mid;
    //         }
    //         else if(a[mid]<target)
    //         {
    //             low=mid+1;
    //             mid=(low+high)/2;
    //         }
    //         else
    //         {
    //             high=mid+1;
    //             mid=(low+high)/2;
    //         }

    //     }
    //     return -1;

        // to write a recursive fun just assign low,high in fun;
        public static int Binarysearch(int[] a, int target,int low,int high) {
            int mid=(low+high)/2;
            while(low<=high)
            {   
                if(a[mid]==target)
                {   
                    return mid;
                }
                else if(a[mid]<target)
                {
                    return Binarysearch(a, target, mid+1, high);
                }
                else
                {
                    return Binarysearch(a, target, low, mid+1);
                }
    
            }
            return -1;
    }
}
