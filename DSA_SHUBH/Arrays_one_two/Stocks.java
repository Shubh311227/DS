import java.util.Scanner;
// know where to put return
// bp-sp or sp-bp: choose consciously rechecking
public class Stocks {
    public static int maxProfit(int price[]){
        int bp = price[1];
        int max_profit = 0;
        for(int i=1; i<price.length;i++){
            if(bp<=price[i]){
                int profit = price[i]-bp;
                max_profit = Math.max(max_profit, profit);          
            }
            else{
                bp = price[i];
            }
        } 
        return max_profit;       
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of price array");
        int n = sc.nextInt();
        if(n<1 && n>100000){
            System.out.println("Invalid entry. Must be between one and 1 lakh");
            return;
        }
        int price[] = new int[n];
        System.out.println("Enter Price");
        for(int i =0; i<n; i++){
            price[i] = sc.nextInt();
            if(price[i]<0 && price[i]>10000){
                System.out.println("Invalid Entry, must be between zero and ten thousand");
                return;
            }
        }
        System.out.println("Maximum profit is " + maxProfit(price));

        
    }
}
