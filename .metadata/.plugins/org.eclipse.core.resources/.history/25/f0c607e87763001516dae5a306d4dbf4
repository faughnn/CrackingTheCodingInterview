import java.io.IOException;


public class Reverse {

	public static String reverseString(String word){
		char[] chars = word.toCharArray();
		char[] reverseWord = word.toCharArray();

		int j = 0;
		for(int i = chars.length -1; i > 0; i--){
			chars[i] = reverseWord[j];
			j++;
		}
		 
		String reverseWordStr = new String(reverseWord);
		
		return reverseWordStr;
	}
	
	public static void main(String[] args) throws IOException {
		
		String str = new String("rarara24332");
		
//		System.out.println(reverseString("str")); 
		System.out.print(str);
		System.out.print(reverseString(str));
	}
	
}
