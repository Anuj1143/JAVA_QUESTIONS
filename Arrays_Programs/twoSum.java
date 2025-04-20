

import java.util.Scanner;

class twoSum {
    public static int  pairSum(int arr[], int target){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    sum+=1;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         int target=sc.nextInt();
         int ans=pairSum(arr, target);
         System.out.println(ans);
         sc.close();
    }
    
} 

