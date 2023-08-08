package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Chocolatedistproblem {
    public static int distribution(int []arr,int m){
        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-m+1;i++){
            if(arr[i+m-1]-arr[i]<min){
                min=arr[i+m-1]-arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String splitArray[]=s.split(" ");
        int arr[]=new int[splitArray.length];
        for (int i = 0; i < splitArray.length; i++) {
            arr[i] = Integer.parseInt(splitArray[i]);
        }
        int m=sc.nextInt();
        int min=distribution(arr, m);
        System.out.println(min);
        sc.close();

    }
}
