import java.util.Scanner;

public class swapAlternate {
    public static void swapAlternated(int [] arr){
        for(int i=0; i<arr.length-1; i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;

        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        swapAlternated(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
        sc.close();
    }
}
