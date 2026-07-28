import java.util.*;
class CountMajority{
public static int partition(int arr[], int si, int ei){
int pivot = arr[ei];
int i =si-1;
for(int j = si; j<ei; j++){
    if(arr[j]<pivot){
        i++;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
    i++;
    int temp = arr[ei];
    arr[ei] = arr[i];
    arr[i] = temp;
return i;
}
public static void quickSort(int arr[], int si, int ei){
    if(si>=ei){
        return;
    }
    int pIdx =  partition(arr,si,ei);
    quickSort(arr, si, pIdx-1);
    quickSort(arr, pIdx+1, ei);

}
public static int majorElement(int arr[]){
    int n = arr.length;
    int freq =1;
    for(int i =1; i<n; i++){
        if(arr[i]==arr[i-1]){
            freq++;
        }
        else{
            freq=1;
        }
        if(freq>n/2){
            return arr[i];
        }
    }
return -1;
}
public static void main(String[] args) {
    int arr[] = {6,6,6,8,6,7};
    quickSort(arr,0,5);
    System.out.println("Major element is "+ majorElement(arr));


}

}