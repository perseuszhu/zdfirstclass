package ����һ��;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int type = in.nextInt();
		switch (type) {
		case 1:
		case 2:
			System.out.println("���");
			break;
		case 3: 
			System.out.println("���Ϻ�");
		case 4:
			System.out.println("�ټ�");
			break;
		default:
			System.out.println("ɶ");
			break;
		}
	}
			
	

}
