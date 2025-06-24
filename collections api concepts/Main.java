
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //List<Integer> nums=new ArrayList<>();
        //Set<Integer> nums=new HashSet<Integer>();
       //Set<Integer> nums=new TreeSet<Integer>();
        // nums.add(6);
        // nums.add(16);
        // nums.add(6);
        // nums.add(26);
        // nums.add(46);
        // for (int i:nums){
        // System.out.println(i);
        // }
        // Map<String,Integer> n=new HashMap<>();
        // n.put("jhanu", 32);
        // n.put("suni", 35);
        // n.put("gow", 23);
        // System.out.println(n);
        // // to get as k-v
        // for(String k:n.keySet())
        // {
        //     System.out.println("Name : " + k + " " +"roll no :" + n.get(k));
        // }

        // comparing and swapping

        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10)
                    return 1;
                else if (i % 10 < j % 10)
                    return -1;
                else
                    return 0;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(12);
        nums.add(34);
        nums.add(21);
        nums.add(40);

        Collections.sort(nums, comp);

        System.out.println(nums);

    }
}
