package arrays;

public class DiagonalDifference {

	static int diagonalDifference(int[][] arr) {
        int ld = 0;
        int rd = 0;
        int max = arr.length;
        for(int i =0; i<max; i++) {
        	for(int j=0 ; j<max; j++) {
        		if(i==j) {
        			ld += arr[i][j];
        		}
        		if(i+j==max-1) {
        			rd += arr[i][j];
        		}
        	}
        }
       return Math.abs(rd-ld);
    }
	
	public static void main(String[] args) {
		
		int[][] arr = {{1,4,7}, {4,8, 11}, {19,-8,7}}; 
		System.out.println(arr.length);
	}

}
