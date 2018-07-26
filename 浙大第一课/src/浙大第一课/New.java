package Õã´óµÚÒ»¿Î;

import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =  new Scanner(System.in);
		int score = in.nextInt();
		int x = score / 20;
		switch (x)
		{
		case 0: 
			System.out.println("Sorry you failed.");
			break;
		case 1:
			System.out.println("You got a D");
			break;
		case 2:
			System.out.println("You got a C");
			break;
		case 3:
			System.out.println("You got a B");
			break;
		case 4:
			System.out.println("You got a A");
			break;
		case 5:
		System.out.println("You got a a");
		break;
		default:
			System.out.println("You put a wrong number");
	}

}
}
