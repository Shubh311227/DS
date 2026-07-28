import java.util.*;
public class Complex{
    public static void main(String[] args) {
        Complx c = new Complx();
        c.sum();
        c.difference();
        c.product();
    }
}
class Complx{
    int real1 = 1;
    int complex1 = 2;  
    int real2 = 3;
    int complex2 = 4; 
    void sum(){
        int real3 = real1 + real2;
        int complex3 = complex1 + complex2;
        System.out.println("First number is" + real1 + "+" + complex1 + "i");
        System.out.println("Second number is" + real2 + "+" + complex2 + "i");
        System.out.println("sum is" + real3 + "+" + complex3 + "i" );
    }
    void difference(){
        int real3 = real1 - real2;
        int complex3 = complex1 - complex2;
        System.out.println("difference is" + real3 + "+" + complex3 + "i" );        
    }
    void product(){
        int ac = real1*real2;
        int bd = complex1*complex2;
        int real3 = ac-bd;
        int ad = real1*complex2;
        int bc = real2*complex1;
        int complex3 = ad+bc;

        System.out.println("product is" + real3 + "+" + complex3 + "i" );
    }
}