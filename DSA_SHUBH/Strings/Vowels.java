import java.util.*;

public class Vowels {
    public static int counter(String str){
        int count=0;
        for(int i =0; i<str.length()-1; i++){
            int ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Write your input");
        str = sc.nextLine();
        System.out.println(counter(str));
    }
    
}
