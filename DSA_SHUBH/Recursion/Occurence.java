import java.util.*;
class Occurence {

    public static void numberOfOccurences(int arr[], int key, int i){
        if(i == arr.length){
            return;
        }


        if(arr[i] == key){
            System.out.print(i + " ");
            numberOfOccurences(arr,2,i+1);
        }
        else{
          numberOfOccurences(arr,2,i+1);  
        }
    }
public static void main(String[] args) {
    //to find all the occurrences(indices) 
    // of a given element(Key) and print them.
    int arr[] = {3,2,4,5,6,2,7,2,2};
    numberOfOccurences(arr,2,0);
}
}
