package 浙大第一课;

import java.util.Scanner;

public class 求和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double sum = 0.0;
		int sign = 1;
		for (int i =1; i <=n; i++, sign = -sign)
		{
			sum +=1.0/i;
		}
		System.out.println(sum);
		System.out.printf("%.2f",sum);
		
	}

}
