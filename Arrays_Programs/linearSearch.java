package Arrays_Programs;

import java.util.Scanner;

public class linearSearch {

    public static void search(int[] arr, int target){
        int n=arr.length;
        boolean found=false;

        for(int i=0; i<n; i++){
            if(arr[i]==target){
                System.out.println("Target is fount"+i+" value of"+arr[i]);
                found= true;
                break;
            }
            if(!found){
                System.out.println("Target is not found");
            }
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();

        search(arr, target);
    }
}
