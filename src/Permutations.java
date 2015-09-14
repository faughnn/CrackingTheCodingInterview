import java.io.IOException;
import java.util.Arrays;

public class Permutations {
	
	public static boolean isPermutation(String str1, String str2){
		
		if(str1.length() != str2.length()){
			return false;
		}
		
		char[] chars1 = str1.toCharArray();
		char[] chars2 = str2.toCharArray();
		
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		
//		sortString(str1);
//		sortString(str2);
		
		for(int i = 0; i < chars1.length; i++){
			if(chars1[i]!= chars2[i]){
				return false;
			}		
		}
		return true;
	}
	
	public static String sortString(String str1){
		
		char[] chars1 = str1.toCharArray();
		Arrays.sort(chars1);
		str1 = chars1.toString();
		return str1;	
	}
	
	public static void main(String[] args) throws IOException {
		
		String str1 = new String("rarara24332");
		String str2 = new String("24332rarara");

		System.out.print(isPermutation(str1, str2) ? "It is" : "It isn't");
	}

}
