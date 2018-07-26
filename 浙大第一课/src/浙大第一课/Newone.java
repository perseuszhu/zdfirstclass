package Õã´óµÚÒ»¿Î;

import java.util.Scanner;

public class Newone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		int t = 0;
		/*if (x > y)
		{
			if (y > z)
			{
				System.out.println(x+">"+y+">"+z);
			}
			else
			{
				System.out.println(x+">"+z+">"+y);
			}
		}
		else
		{
			if
		}*/
		if (x>y)
		{
			if (z>y)
			{
				if( x > z)
				{
					t = y;
					y = z;
					z = t;
				}
				else
				{
					t = x;
					x = z;
					z = t;
					t = y;
					y = z;
					z = t;
				}
			}
		}
		else
		{
			if (x > z)
			{
				t = x;
				x = y;
				y = t;
			}
			else
			{
				if (y>z)
				{
				t = x;
				x = y;
				y = z;
				z = t;
				}	
				else
				{
					t = x;
					x = z;
					z = t;		
				}
		}
	}
		System.out.println(x+">"+y+">"+z);
}
}
