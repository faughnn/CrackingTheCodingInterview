package ArraysAndStrings;
import java.io.IOException;

public class RotateImage {

	public static int[][] rotateImage(int[][] matrix, int n){
		
		for (int layer = 0; layer <n/2; ++layer){
						
			int first = layer;
			int last = n - 1 - layer;
			
//			[][][][last][]		layer
//			[][][][][]
//			[][][][][]
//			[][][][][]
//			[][][][][]
			
			for(int i = first; i < last; ++i){
				int offset = i - first;		
				
				//save top
				int top = matrix[first][i];
								
				//left -> top
				matrix[first][i] = matrix[last-offset][first];
				
				//bottom -> left
				matrix[last-offset][first] = matrix[last][last-offset];
				
				//right -> bottom
				matrix[last][last-offset] =  matrix[i][last];
				
				//top -> right
				matrix[i][last] = top;
			}
		}
		
		return matrix;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		
		int n = 4;
		int[][] matrix = new int[n][n];
		
		for (int row = 0; row < n; row ++)
		    for (int col = 0; col < n; col++)
		    	matrix[row][col] = (char) ('1' + row * 3 + col);
			
		for (int row = 0; row < n; row ++)
            for (int col = 0; col < n; col++)
            	if(col == n - 1){
            		System.out.println(matrix[row][col]+ " ");
            	} else {
            		System.out.print(matrix[row][col]+ " ");
            	}
		
		int[][] rotatedMatrix = rotateImage(matrix, n);
		
		System.out.println ("break");
		
		for (int row = 0; row < n; row ++)
            for (int col = 0; col < n; col++)
            	if(col == n-1){
            		System.out.println (rotatedMatrix[row][col]+ " ");
            	} else {
            		System.out.print (rotatedMatrix[row][col]+ " ");
            	}
                
	}
	
}
