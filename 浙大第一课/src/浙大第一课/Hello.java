package Õã´óµÚÒ»¿Î;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello World");
        Scanner in = new Scanner(System.in);
//        System.out.println("echo:" + in.nextLine());
        int x;
        int y;
        System.out.print("Please enter the First Number:");
        y = in.nextInt();
        System.out.print("Please enter the Second Number:");
        x = in.nextInt();
        System.out.println(y+"-"+x+"="+(y-x));
        
	}

}
 