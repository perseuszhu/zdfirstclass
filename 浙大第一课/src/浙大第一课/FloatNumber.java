package Õã´óµÚÒ»¿Î;

import java.util.Scanner;

public class FloatNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double foot, inch;
		Scanner in = new Scanner(System.in);
		foot = in.nextDouble();
		inch = in.nextDouble();
		System.out.println("foot="+foot+",inch="+inch);
		System.out.println("(foot+inch/12)*0.3048 = meters");
		System.out.println((int)((foot+inch/12.0)*0.3048*100)+"cm");
	}

}
