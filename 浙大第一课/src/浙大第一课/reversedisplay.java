package Õã´óµÚÒ»¿Î;

import java.util.Scanner;

public class reversedisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		do
		{
			int a = x%10;
			x=x/10;
			System.out.print(a);
		}while (x!=0);
	}

}
