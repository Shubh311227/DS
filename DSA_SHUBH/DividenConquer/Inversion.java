import java.util.*;
public class Inversion{
    public static int mergeSort(int arr[],int start, int end){
        int count = 0;
        if(end>start){ //
        int mid = (start+end)/2;
        count = mergeSort(arr,start,mid);
        count += mergeSort(arr,mid+1,end);
        count += merge(arr,start,mid,end);
        }
        return count;
    }
    public static int merge(int arr[], int start, int mid, int end){
        int i = start;
        int j = mid;
        int k = 0;
        int count = 0;
        int temp[] = new int[(end-start+1)]; //
        while(i<mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                k++;
                i++;
            }
            else{
                temp[k] = arr[j];
                count += (mid-i);
                k++;
                j++;
            }
        }
            while(i<mid){
                temp[k] = arr[i];
                k++; //
                i++;

            }
            while(j<=end){
                temp[k] = arr[j];
                k++; //
                j++;
            }

            for(i=start,k=0;i<=end;i++,k++){ //
                arr[i] = temp[k];
            }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1,8,3,4,5,6};
        System.out.println(mergeSort(arr, 0, 5));
    }
}