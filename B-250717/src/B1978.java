import java.util.*;

public class B1978 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int num1 = num ;
        int cnt = 0;
        
        for (int i=0; i<num1; i++){
            int num2 = in.nextInt();
            int n = 0;
            
            if (num2 ==2 ){
                cnt++;
            }
            
            if (num2> 2){
                for (int j = 2; j< num2; j++){
                    if (num2 %j ==0){
                        n++;
                        break;
                    }
                }
                
                if (n==0){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        
    }
       
}
