
//Linear search

import java.util.Scanner;

public class Linear {
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
        int res=linearsearch(a,target);
       if(res!=-1)
       {
        System.out.println("the element found at index " + res);
       }
       else{
        System.out.println("the element not found ");
       }

    }
    public static int linearsearch(int[] a, int target) {
        int n=a.length;
        int steps=0;
        for(int i=0;i<n;i++)
        { 
            steps++;
            if(a[i]==target)
            {   System.out.println("steps taken by linear search : "+ steps);
                return i;
            }
        }
        return -1;
    }
}
