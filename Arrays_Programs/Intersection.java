import java.util.Scanner;

public class Intersection {
    public static void IntersectionArrays(int[]arr1, int[]arr2){
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j]=Integer.MIN_VALUE;
                    break;
                }
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int m=sc.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<n; i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0; i<m; i++){
            arr2[i]=sc.nextInt();
        }

        IntersectionArrays(arr1, arr2);
        sc.close();
    }
}
