import java.util.Scanner;

public class B10798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[][] c_arr = new char[5][15];
		int max = 0;
		
		for(int i=0;i<5;i++) {
			String str = sc.next();
			
			if(str.length()>max) 
				max = str.length();
			
			for(int j=0;j<str.length();j++) {
				c_arr[i][j] = str.charAt(j);
			}
		}
		
		
		for(int i=0;i<max;i++) {
			for(int j=0;j<5;j++) {
				if(c_arr[j][i] == '\0')  
					continue;
				System.out.print(c_arr[j][i]);
			}
		}
		sc.close();
	}
}