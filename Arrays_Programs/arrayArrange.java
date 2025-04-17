package Arrays_Programs;

import java.util.Scanner;

public class arrayArrange {

    public static void arrange(int[]arr, int n){
        int index=0;
        for(int i=1; i<=n; i+=2){
            arr[index++]=i;
        }
        for(int i=n; i>=2; i-=2){
            arr[index++]=i;
        }
        for(int num:arr){
            System.out.println(num+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        arrange(arr, n);
       
    }
}
