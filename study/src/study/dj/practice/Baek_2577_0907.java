package study.dj.practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek_2577_0907 {

	public static void main(String[] args) {
		System.out.println("**백준_2577번_숫자의 개수**");
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		String result = Integer.toString(A*B*C);
				
		for(int i=0;i<10;i++) {
			int count = 0 ;
			for(int j=0;j<result.length();j++) {
				if((result.charAt(j) - 48)==i) count++;
			}
			System.out.println(count);
		}
		
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);

	}

}
