package ����һ��;

import java.util.Scanner;

public class ���Լ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 int x = in.nextInt();
		 int y = in.nextInt();
		 int gcd = 1;
		 for (int i =2;i <=x && i <=y ; i++)
		 {
			 if ( x %i==0 && y %i ==0)
			 {
				 gcd = i;
			 }
		 }
		 System.out.println(x+"��"+y+"�����Լ����"+gcd);
		 
	}

}
