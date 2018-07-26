package 浙大第一课;

import java.util.Scanner;

public class 年龄 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		final int MINOR = 35;
		System.out.println("请输入你的年龄：");
		int age = in.nextInt();
		System.out.println("你的年龄是："+ age);
		if ( age <= MINOR)
		{
			System.out.println("年轻是美好的");
		}
		else
		{
			System.out.println("年龄决定了你的精神世界");
			
		}
	}

}
