package ����һ��;

import java.util.Scanner;

public class ��Ʊ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		��ʼ��
		Scanner in = new Scanner(System.in);
		int balance = 0;
//		����Ͷ�ҽ��
	while (true)
	{
			System.out.println("��Ͷ��:");
			int amount = in.nextInt();
			balance = balance +amount;
			if ( balance >=10 )
			{
		//		��ӡ��Ʊ
				System.out.println("*******************");
				System.out.println("****    ��Ʊ                ****");
				System.out.println("****  Ʊ�ۣ�ʮԪ         ****");
				System.out.println("*******************");
		//		��ӡ����������
				System.out.println("���㣺"+(balance-10));
				balance = 0;
			}
			else
			{
				System.out.println("����,��ǰ��"+ balance);
			}
	}
		
	}
} 