public class Triplet {
    public static void found(int arr[]){
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0]= arr[0];
        int sum=0; 
        for(int i =0; i<n;i++){
            for(int j=i+1;j<n;j++){
             for(int k=j+1;k<n;k++){             
                if(arr[i] + arr[j] + arr[k] == 0){
                  if(arr[i]!=arr[j] && arr[j]!=arr[k] && arr[i]!=arr[k]){
                        System.out.print("[");
                        System.out.print( arr[i] + ", ");
                        System.out.print( arr[j] + ", ");
                        System.out.print( arr[k]);
                      System.out.println("]");  
                  }  
                }
            }   
             
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        found(arr);
    }
}
