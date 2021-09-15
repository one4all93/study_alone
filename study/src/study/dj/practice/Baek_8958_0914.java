package study.dj.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek_8958_0914 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("**백준_8958번_OX퀴즈**");
		
//		"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. 
//		O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
//		문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 
		
//		예를 들어, 10번 문제의 점수는 3이 된다.

//		"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

//		OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));

		BufferedWriter bw =
				new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st; 
		
		String arr[]; 
		
		int T = Integer.parseInt(br.readLine());
		String a = null;
		
		for(int i=0; i<T; i++) {
			a = br.readLine();
			st = new StringTokenizer(a,"X");
			arr = new String[st.countTokens()];
			for(int j=0; j<arr.length;j++) {
				arr[j]=st.nextToken();
			}
			int n = arr[i].length();
			int d = 1;
			for(int j=0; j<n; j++) {
				d += (j+1);
			}
			bw.write(d);
			bw.newLine();
		}
		bw.flush();
		
		
	}

}
