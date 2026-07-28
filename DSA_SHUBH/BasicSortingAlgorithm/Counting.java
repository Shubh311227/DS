import java.util.*;
public class Counting {
    public static void sort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            // making count array
            // content of array as index of count to compute frequency
            count[arr[i]]++;
        }
        // sorting
        int j =0;
        for(int i=count.length-1; i>=0; i--){
            // making arr fxn with j as sorted parameter
            // i similar to  contents arr[] elemnts
            // loop lenghth will be count.length as count array is superset here from which arr[j] is being derived.
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }

        }
    }

    public static void printarr(int arr[]){
        sort(arr);
        System.out.print("Sorted Array(Selection): [ ");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        printarr(arr);
    }
        
}
