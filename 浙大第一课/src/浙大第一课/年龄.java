package ����һ��;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		final int MINOR = 35;
		System.out.println("������������䣺");
		int age = in.nextInt();
		System.out.println("��������ǣ�"+ age);
		if ( age <= MINOR)
		{
			System.out.println("���������õ�");
		}
		else
		{
			System.out.println("�����������ľ�������");
			
		}
	}

}
