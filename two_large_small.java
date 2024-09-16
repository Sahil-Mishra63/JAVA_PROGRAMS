import java.util.Scanner;

public class two_large_small{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter 10 elements into the array");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        
        int large = arr[0];
        int slarge = arr[0];
        int small = arr[0];
        int ssmall = arr[0];
            for(int i = 1; i < arr.length; i++){
                if(arr[i] > large){
                    large = arr[i];
                }
                if(arr[i] < small){
                    small = arr[i];
                }
            }
            
            for(int i = 1; i < arr.length; i++){
                if(arr[i] != large && (slarge == large || arr[i] > slarge)){
                    slarge = arr[i];
                }
                if(arr[i] != small && (ssmall == small || arr[i] < ssmall)){
                    ssmall = arr[i];
                }
            }
            
        System.out.println("largest:" + large);
        System.out.println("largest:" + slarge);
        System.out.println("smallest:" + small);
        System.out.println("smallest:" + ssmall);
    }
}
