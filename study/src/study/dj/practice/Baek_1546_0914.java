package study.dj.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_1546_0914 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("**백준_1546번_평균**");
		
//		세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 		
//		일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
//		예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
//		세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());	// 과목갯수 입력 받기
		
		int arr[] = new int[N];
		
		StringTokenizer st = 
				new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}

//		sc.close();
		
		Arrays.sort(arr);		// 정렬
		
		int M = arr[N-1];		// 정렬된 값 중 맨 마지막 인덱스가 최댓값
//		System.out.println(M);
		
//		System.out.println((double)arr[0]/M*100);
		
		double avg = 0;
		
		for(int i=0; i<N; i++) {
			avg+=((double)arr[i]/M*100);
		}
		System.out.println(avg/N);
		
	}

}
