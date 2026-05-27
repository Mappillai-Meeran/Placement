import java.util.Scanner;
public class Array3{
    public static void main(String args[]){
        
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        
        }
    }
}