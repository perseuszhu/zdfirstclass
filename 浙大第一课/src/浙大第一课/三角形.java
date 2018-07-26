package 浙大第一课;

import java.util.Scanner;

public class 三角形 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x,y,z;
		x = in.nextInt();  
		y = in.nextInt();
		z = in.nextInt();
		if (((x+y)>z) & ((x+z)>y) & ((y+z)>x))
		{
			if ((x==y) & (y==z))
			{
				System.out.println("We have a Equilateral Triangle" );
			}
			else if ((x==y) || (y==z) || (x==z))
					{
				System.out.println("we Have a Isosceles Triangle");
					}
			else
			{
				System.out.println("We have a Triangle");
			}
		}
		else
		{
			System.out.println("We do not have a Triangle");
		}
	}

}
