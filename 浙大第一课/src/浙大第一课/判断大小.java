package 浙大第一课;

import java.util.Scanner;

public class 判断大小 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x, y, z;
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		int max = 0;
		if ( x>y){
			if (x>z){
				max = x;}
			else{
				max = z;}}
		else{
			if (y>z){
				max = y;}
			else{
				max = z;}}
		System.out.println("Max="+max);}}