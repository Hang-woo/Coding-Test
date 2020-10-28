package Git;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//입력받은 정수의 약수를 구해서 더하는 알고리즘
		//i는 입력받은 수를 저장 , k는 합계를 저장
		Scanner s =new Scanner(System.in);
		int k=0;
		System.out.println("정수를 입력하세요");
		int i = s.nextInt();
		
		for (int j = 1; j <=i; j++) {
			if(i%j==0) {
				//System.out.println("나머지0");
				k= k+j;	
			}
		}
		System.out.println(i+"의 약수의 합은"+k);
	}

}
