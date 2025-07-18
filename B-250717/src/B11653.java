import java.util.Scanner;

public class B11653{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int i = 2;
        
        while (n>1){
            if (n % i == 0) {
                System.out.println(i);  
                n = n / i;                 
            } else {
                i++;             
            }
        }
    }
    
}