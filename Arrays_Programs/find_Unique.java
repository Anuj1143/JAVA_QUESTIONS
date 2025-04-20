import java.util.Scanner;

public class find_Unique {
    public static int findDuplicate(int arr[]){
        int result=0;
        for(int num:arr){
            result^=num;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int ans=findDuplicate(arr);
        System.out.println(ans);
        sc.close();
    }
}
