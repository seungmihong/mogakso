import java.util.Scanner;

public class B2444{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        for(int i = 0; i < A; i++){
            for(int j = 0; j < A - i - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = A - 2; i >= 0; i--){
            for(int j = 0; j < A - i - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
