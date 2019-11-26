package Chapter6;

public class CharArrayTest {

	public static void main(String[] args) {
		
		char[] cArr = new char[26];
		char ch = 'A';
		
		for(int i=0; i<cArr.length; i++) {
			cArr[i] = ch++;
		}
		
		for(int i=0; i<cArr.length; i++) {
			System.out.println(cArr[i] + ", " + (int)cArr[i]);
		}
		
	}

}
