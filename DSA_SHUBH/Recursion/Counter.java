import java.util.*;
public class Counter {
    public static void lengthOfString(int i, String str){
        if(i==str.length()){
            System.out.println(i);
            return;
        }
        lengthOfString(i+1, str);


    }
    public static void main(String[] args) {
        String str = "abcab";
        lengthOfString(0, str);
        System.out.println(str.substring(1,2));
    }
}
