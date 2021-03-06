package ArraysAndStrings;
import java.io.IOException;

public class ReplaceSpaces {

	public static String replaceSpaces(String str1){
		
		char[] chars = str1.toCharArray();
		int countWhiteSpaces = 0;
		
		for(int i = 0; i< chars.length-1; i++){
			if(chars[i] == ' '){
				countWhiteSpaces++;
			}
		}
		 
		char[] charsFinal = new char[chars.length + (countWhiteSpaces * 3)];
		int j = 0;
		for(int i = 0; i < chars.length ; i++){
			if(chars[i] == ' '){
				charsFinal[j] = '%';
				charsFinal[j + 1] = '2';
				charsFinal[j + 2] = '0';
				j = j + 3;
			} else{
				charsFinal[j] = chars[i];
				j++;
			}
		}
		String strFinal = new String(charsFinal);
		return strFinal;
	}
	
	public static void main(String[] args) throws IOException {
		
		String str = new String("ra ra ra 24332 ");
		
//		System.out.println(reverseString("str")); 
		System.out.println(str);
		str = replaceSpaces(str);
		System.out.println(str);
	}
}
