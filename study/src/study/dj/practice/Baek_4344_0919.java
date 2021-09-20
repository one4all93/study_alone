package study.dj.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek_4344_0919 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("**백준_4344번_평균은넘을까**");
		
//		첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
//
//		둘째 줄부터 각 테스트 케이스마다 
//		학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
//		이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw =
				new BufferedWriter(new OutputStreamWriter(System.out));
		
		int C = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i=0; i<C; i++) {
			st = new StringTokenizer(br.readLine());
			
//			System.out.println("입력받은 수 갯수 : " + st.countTokens());
			
			int arr[] = new int[st.countTokens()];
			
//			System.out.println("배열 크기 : " + arr.length);
			
			for(int j=0;j<arr.length;j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			int a = arr[0];
			int sum = 0;
			for(int j=1;j<arr.length;j++) {
				sum += arr[j];
			}
			
//			System.out.println(a);
//			System.out.println(sum);
//			System.out.println(sum/a + "%");
			
			int avg = sum/a;
			
			int count = 0;
			
			for(int j=1;j<arr.length;j++) {
				if(avg<arr[j]) {
					count++;
				}
			}
			
//			System.out.println(count);
//			System.out.println((double)count/a*100);
//			System.out.println(String.format("%.3f", (double)count/a*100) + "%");
//			bw.write((double)count/a*100 + "%");
			bw.write(String.format("%.3f", (double)count/a*100) + "%");
			bw.newLine();
		}
		bw.flush();
		bw.close();
		
	}

}
