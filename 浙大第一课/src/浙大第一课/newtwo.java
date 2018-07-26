package Õã´óµÚÒ»¿Î;

import java.util.Scanner;

public class newtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		int t = 0;
		if (x < y)
		{
			t = x;
			x = y;
			y = t;
		}
		if (x < z)
		{
			t = x;
			x = z;
			z = t;
		}
		if (y < z)
		{
			t = y;
			y = z;
			z = t;
		}
		System.out.println(x+">"+y+">"+z);
	}

}
