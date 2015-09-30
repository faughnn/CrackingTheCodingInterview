package ArraysAndStrings;
import java.io.IOException;

public class CompressString {
	
	public static String compressString(String string1){
		
//		char[] chars = string1.toCharArray();
//		char[] charsCompressed = new char[string1.length()];
		
		String mystr = "";
		
		int count = 0;
		
		char tmp = string1.charAt(0);
//		chars[0] = tmp;
		for (int i = 0; i < string1.length(); i++){
			if(string1.charAt(i) == tmp){
				count++;
			} else{
				mystr = mystr + tmp + count;
				count = 1;
				tmp = string1.charAt(i);
			}
		}
		mystr = mystr + tmp + count;
		
		if(string1.length() > mystr.length()){
			return mystr;
		} else {
			return string1;
		}
		
	}
	

	public static void main(String[] args) throws IOException {
		
		String str = new String("aaabbbcccccc");
		String str2 = compressString(str);
		System.out.print(str2);
	}
	

}
