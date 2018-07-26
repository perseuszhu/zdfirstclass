package Õã´óµÚÒ»¿Î;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x;
		x = in.nextInt();
		if ( (x+800)>=2400)
		{
			System.out.println(x+800-2400);
		}
		else
		{
			System.out.println(x+800);
		}
	}

}
