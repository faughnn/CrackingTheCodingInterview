package ArraysAndStrings;
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
	
	public static boolean isPermutationBookSolution(String s, String t){
		if(s.length() != t.length()){
			return false;
		}
		
		int[] letters = new int[256];
		
		char[] s_array = s.toCharArray();
		for (char c : s_array){
			letters[c++];
		}
		
		for (int i = 0; i<t.length(); i++){
			int c = (int)t.charAt(i);
			if (--letters[c]<0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		
		String str1 = new String("rarara24332");
		String str2 = new String("24332rarara");
		String str3 = new String("24332rarara22");

		System.out.println(isPermutation(str1, str2) ? "It is an anagram" : "It isn't an anagram");
		System.out.println(isPermutation(str1, str3) ? "It is an anagram" : "It isn't an anagram");
		System.out.println(isPermutationBookSolution(str1, str2) ? "It is an anagram" : "It isn't an anagram");
		System.out.println(isPermutationBookSolution(str1, str3) ? "It is an anagram" : "It isn't an anagram");
	}

}
