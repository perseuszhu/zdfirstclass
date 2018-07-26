package 浙大第一课;

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
			System.out.println("你好");
			break;
		case 3: 
			System.out.println("晚上好");
		case 4:
			System.out.println("再见");
			break;
		default:
			System.out.println("啥");
			break;
		}
	}
			
	

}
