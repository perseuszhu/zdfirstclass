package 浙大第一课;

import java.util.Scanner;

public class 一元二次方程 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int x = b*b;
		if ((x-(4*a*c))>=0)
		{
			System.out.println("x="+(((-b)+Math.sqrt(x-(4*a*c))))/(2*a));
			System.out.println("x="+(((-b)-Math.sqrt(x-(4*a*c))))/(2*a));
		}
		else
		{
			System.out.println("There is no correct answer");
		}
			
	
	}

}
