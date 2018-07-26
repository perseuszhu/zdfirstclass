package 浙大第一课;

import java.util.Scanner;

public class 数组一 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double sum = 0;
		int cnt = 0;
		cnt = in.nextInt();
		if ( cnt > 0 ) 
		{
			int[] numbers = new int[cnt];
			for ( int i=0; i<cnt; i++)
			{
				numbers[i] = in.nextInt();
				// numbers[0] = x
				// numbers[1] = x
				sum += numbers[i];
			}
			if ( cnt > 0);
			{
				double average = sum/cnt;
				for (int i = 0; i<numbers.length; i++)
				{
					if (numbers[i] > average) 
					{
						System.out.println(numbers[i]);
					}
				}
				System.out.println(sum/cnt);
				
			}
			
		}
		
	}

}
