import java.util.Scanner;

public class Trapped {
    public static int totalTrap(int trap[]){
        int n = trap.length;
        int Leftmax[]= new int[n];
        Leftmax[0] = trap[0];
        int wl =0;
        int trapped=0;
        for(int i=1; i<n;i++){
            Leftmax[i] = Math.max(trap[i],Leftmax[i-1]);
        }
        int Rightmax[]= new int[n];
        Rightmax[n-1] = trap[n-1];
        for(int i=n-2; i>=0;i--){
            Rightmax[i] = Math.max(trap[i],Rightmax[i+1]);
        }
        for(int i=0;i<n;i++){
            wl = Math.min(Leftmax[i],Rightmax[i]);
            trapped += wl-trap[i];
        }
        return trapped;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of trap array");
        int n = sc.nextInt();
        if(n<1 && n>20000){
            System.out.println("Invalid entry. Must be between one and twenty thousand");
            return;
        }
        int trap[] = new int[n];
        System.out.println("Enter heights");
        for(int i =0; i<n; i++){
            trap[i] = sc.nextInt();
            if(trap[i]<0 && trap[i]>100000){
                System.out.println("Invalid Entry, must be between zero and one lakh");
                return;
            }
        }
        System.out.println("Total Water Trapped is " + totalTrap(trap));
    }
}
