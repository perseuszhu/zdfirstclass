package ����һ��;

import java.util.Scanner;

public class Doѭ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count = 0;
		do
		{
			number = number/10;
			count = count +1;
			System.out.println("number="+number+";count="+count);
		} while(number >0);
		System.out.println(count);
	}

}
