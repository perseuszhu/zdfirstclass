package ����һ��;

import java.util.Scanner;

public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int [] prime = new int[50];
		int cnt = 1;
		prime[0] = 2;
		MAIN_LOOP:
			for (int x =3; cnt<50; x++)
			{
				for (int i =0; i<cnt; i++)
				{
					if (x %prime[i] == 0)
					{
						continue MAIN_LOOP;
					}
				}
				prime[cnt++] = x;
			}
		for ( int k : prime)
		{
			System.out.print(k+" ");
		}
	}

}
