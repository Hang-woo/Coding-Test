package Git;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		/*
		 * 3문제 설명

		 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
		
		소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
		(1은 소수가 아닙니다.)
		
		제한 조건
		n은 2이상 1000000이하의 자연수입니다.
		
		입출력 예
		n	result
		10	4
		5	3
		
		입출력 예 설명
		입출력 예 #1
		1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환
		
		입출력 예 #2
		1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환*/
		
		Scanner s = new Scanner(System.in);
		
		int count=0;		//소수를 찾기 위한 변수
		int result =0;		//소수의 개수를 저장하는 변수
		System.out.println("수를 입력하세요");
		int n=s.nextInt();
		
		for(int j=2; j<=n; j++) {		//1은 소수가 아니니 j를 2부터 시작 n까지 반복
			for(int k=2; k<=j; k++) {	//k를 j까지 반복 
				if(j%k==0) {			//j%k를 했을때 0이라면
					count++;			//count++
				}
			}
			
			if(count==1) {				//소수는 1과 자기자신으로만 나눠지므로 자기자신으로 한번만 나눠질때 소수
				System.out.println(j+"");
				result++;				//개수 저장
			}
			count=0;
		}
		
		
		System.out.println("1과"+n+"사이의 소수의 개수는"+result+"개 입니다");
	}

}
