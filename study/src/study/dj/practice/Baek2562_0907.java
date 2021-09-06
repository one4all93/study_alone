package study.dj.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Baek2562_0907 {

	public static void main(String[] args) {
		System.out.println("**백준 2562번 최댓값**");
		
//		9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
//
//		예를 들어, 서로 다른 9개의 자연수
//
//		3, 29, 38, 12, 57, 74, 40, 85, 61
//
//		이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[9];
		int arr2[] = new int[9];
		
		for(int i=0;i<9;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.arraycopy(arr, 0, arr2, 0, 9);
		
		Arrays.sort(arr);	//최댓값을 구하기 위한 정렬
		System.out.println("=============arr값중 최댓값================");
		System.out.println(arr[8]);
		
		for(int i=0;i<9;i++) {	//반복문 돌려서 arr최대값이랑 arr2의 값들이랑 비교하여 일치하면 i출력
			if(arr2[i]==arr[8]) {
				System.out.println(i+1);	//배열순서니까 +1해줌
			}
		}
	
	}

}
