package study.dj.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class For {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println(br);
		try {
			String input = br.readLine();
			
			int t = Integer.parseInt(input);
			
			for(int i = 0; i<t;i++) {
				StringTokenizer st = new StringTokenizer(input," ");
				System.out.println(st);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//BufferedWriter bw = new BufferedWriter(new InputStreamReader(System.in));
		
	}
	
//	A+B - 3	
//	public static void main(String[] args) {
//
//		Scanner s = new Scanner(System.in);
//		
//		int t = s.nextInt();
//		
//		int arr[] = new int[t];
//		
//		for(int i=0; i<t; i++) {
//			
//			int a = s.nextInt();
//			int b = s.nextInt();
//			
//			arr[i] = a+b;
//		}
//		
//		for(int r: arr) {
//			System.out.println(r);
//		}
//		
//		
//	}
	
	
//	nÀ» ÀÔ·Â¹Þ¾Æ n°ö¼À ¸¸µé±â
//	public static void main(String[] args) {
//		
//		Scanner s = new Scanner(System.in);
//		
//		int n = s.nextInt();
//		
//		for(int i=1; i<10; i++) {
//			System.out.println(n + " * " + i + " = " +  n*i);
//		}
//	}

}
