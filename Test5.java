package Git;

public class Test5 {
	/*	문제 설명

		문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

		제한 조건
		s의 길이는 1 이상 5이하입니다.
		s의 맨앞에는 부호(+, -)가 올 수 있습니다.
		s는 부호와 숫자로만 이루어져있습니다.
		s는 0으로 시작하지 않습니다.
		
		입출력 예
		예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
		str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
		*/	
	
	
	
	public int Solution(String s) {
			int i = 0;
			
			if(s.startsWith("-") || s.startsWith("+") ) {	//startsWith()함수는 특정문자나 문자열로 시작하는지 체크하는 함수
				i = new Integer(s.substring(0));			//substring()함수는 문자열을 분리함 인덱스의 0번자리를 분리
			}else {
				i= new Integer(s);
			}
			return i;
		}
}
