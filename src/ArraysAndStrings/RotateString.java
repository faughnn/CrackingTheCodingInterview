package ArraysAndStrings;

public class RotateString {

	// isSubstring checks if one word is a substring of another
	// s1 = xy = waterbottle
	// x = wat
	// y = erbottle
	// s2 = yx = erbottlewat
	// xyxy = waterbottlewaterbottle
	
	// yx is contained within xyxy
	// xyxy = wat-erbottlewat-erbottle
	
	public boolean isRotation(String str1, String str2){
		
		if(str1.length() == str2.length()){
			String str1str1 = str1+str1;
			return isSubstring(str1str1, str2);
		}
		
		return false;
		
	}
	
}
