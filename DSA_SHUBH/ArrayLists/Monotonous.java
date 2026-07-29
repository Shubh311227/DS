import java.util.ArrayList;
public class Monotonous{
    public static void isMonotonous(ArrayList<Integer> list){
        if(list.get(1)>list.get(0)){
            for(int i = 1; i< list.size(); i++){
                if(list.get(i-1)>list.get(i)){
                    System.out.println("Not a monotonous function");
                    return;
                }
            }
        }
        else{
            for(int i = 1; i< list.size(); i++){
                if(list.get(i-1)<list.get(i)){
                    System.out.println("Not a monotonous function");
                    return;
                }
            }
        }
        System.out.println("Monotonous Function");
       
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        isMonotonous(list);
    }
}