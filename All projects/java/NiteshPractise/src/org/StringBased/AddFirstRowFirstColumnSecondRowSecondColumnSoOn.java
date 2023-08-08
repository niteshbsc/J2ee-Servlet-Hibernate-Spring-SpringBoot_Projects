package org.StringBased;

public class AddFirstRowFirstColumnSecondRowSecondColumnSoOn {
	public static void main(String[] args) {

	int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

	// Loop through the rows and columns
	for (int i = 0; i < matrix.length; i++) {
	  for (int j = 0; j < matrix[i].length; j++) {
	    
	    // Check if it is the first row or column
	    if (i == 0 || j == 0) {
	      
	      // Do not add the first element
	      if (i == 0 && j == 0) {
	        continue;
	      }
	      
	      // Add the current element to the first row or column
	      if (i == 0) {
	        matrix[0][j] += matrix[i][j];
	      }
	      if (j == 0) {
	        matrix[i][0] += matrix[i][j];
	      }
	      
	    } else {
	      // Add the current element to the previous row or column
	      matrix[i][j] += matrix[i-1][j] + matrix[i][j-1] - matrix[i-1][j-1];
	    }
	    System.out.println(matrix[i][j]+" ");
	  }
	  
	}

}
}