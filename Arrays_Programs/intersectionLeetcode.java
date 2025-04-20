import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class intersectionLeetcode {

    public static int[] Intersection(int nums1[] , int nums2[]){
        Set<Integer>set1=new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        Set<Integer>set2=new HashSet<>();
        for(int num:nums2){
            if(set1.contains(num)){
                set2.add(num);
            }
        }

        int result[]=new int[set2.size()];
        int i=0;
        for(int num:set2){
            result[i++]=num;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums1[]={1,2,2,1};
        int nums2[]={2,2};
       int[] result=Intersection(nums1, nums1);
       System.out.println("Intersection");
       for(int num:result){
        System.out.print(num+"");

       }
       sc.close();
    }
}
