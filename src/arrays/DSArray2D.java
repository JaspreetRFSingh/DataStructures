package arrays;

import java.util.Scanner;

public class DSArray2D {

	 static int hourglassSum(int[][] arr) {
	        int sum = -999;
	        for(int i = 0; i<4; i++){
	            for(int j = 0; j<4; j++){
	                int temp = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] +arr[i+2][j+1] + arr[i+2][j+2];
	                if(temp>sum){
	                sum = temp;
	            }
	            }
	        }
	        return sum;
	    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] data = new int[6][6];
		for(int i = 0 ; i<6; i++) {
			for(int j=0; j<6; j++) {
				data[i][j] = sc.nextInt();
			}
		}
		sc.close();
		System.out.println(hourglassSum(data));
	}

}
