package 浙大第一课;

import java.util.Scanner;

public class 最大公约数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 int x = in.nextInt();
		 int y = in.nextInt();
		 int gcd = 1;
		 for (int i =2;i <=x && i <=y ; i++)
		 {
			 if ( x %i==0 && y %i ==0)
			 {
				 gcd = i;
			 }
		 }
		 System.out.println(x+"和"+y+"的最大公约数是"+gcd);
		 
	}

}
