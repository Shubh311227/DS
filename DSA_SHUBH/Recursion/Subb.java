public class Subb {
    public static int numberOfSubstrings(String str, int i, int j, int n){
        if(n==1){
            return 1;
        }
       int count = numberOfSubstrings(str, i+1, j, n-1);
        if(str.charAt(i)==str.charAt(j)){
            count++;
        }
        return count;

        }
        
        public static void main(String[] args) {
            String str = "abcab";
            System.out.println(numberOfSubstrings(str, 0, 4, 5));
        }
    }

