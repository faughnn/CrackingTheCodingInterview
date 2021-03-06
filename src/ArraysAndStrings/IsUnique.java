package ArraysAndStrings;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;



public class IsUnique {

	public static boolean isUnique(String word){
		
		char[] chars = word.toCharArray();
		
		HashSet <Character> set= new HashSet<Character>();
		
		for(char c : chars){
			if(set.contains(c)){
				return false;
			}
			else{
				set.add(c);
			}		
		}
		return true;
	}
	
	public static boolean isUniqueNoHash(String word){
		
		char[] chars = word.toCharArray();
		if(chars.length == 1){
			return true;
		}
		
		Arrays.sort(chars);
		
		for(int  i = 0; i < (chars.length - 1); i++){
			if(chars[i] == chars[i+1]){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isUniqueBookSolution(String word){
		if(word.length() > 256){
			return false;
		}
		
		boolean[] char_set = new boolean[256];
		
		for(int i =0; i < word.length(); i++){
			int val = word.charAt(i);
			if(char_set[val]){
				return false;
			}
			char_set[val] = true;		
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(isUnique("Wordd") ? "Unique" : "Not Unique"); 
		System.out.println(isUniqueNoHash("Worw$d") ? "Unique" : "Not Unique"); 
		System.out.println(isUniqueBookSolution("STsENCH") ? "Unique" : "Not Unique");
	}
	
}
