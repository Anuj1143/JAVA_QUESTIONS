
import java.util.*;
public class return_array_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
      int result=Sum(arr);
       System.out.println(result);
       sc.close();
       
    }
    public static  int  Sum(int[] arr){
        int  sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
       
    }
}
