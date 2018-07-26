package 浙大第一课;

import java.util.Scanner;

public class 随机数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] Rand = new int[10];
		int cnt = 0;
		for (int i =0; i<Rand.length; i++)
		{
			Rand[i] = (int)(Math.random()*50);
			System.out.print(Rand[i]+" ");
		}
		int sum=0;
		for (int i = 0; i<Rand.length; i++)
		{
			
			if(Rand[i] %2 ==0)
			{
				cnt++;
				sum=sum+Rand[i]; 
			}
		}
		
		System.out.println(cnt+"Avg="+sum/cnt);
	
	}

}
