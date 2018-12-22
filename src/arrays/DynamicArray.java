package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int q = in.nextInt();
	        @SuppressWarnings("unchecked")
			List<Integer>[] sequences = new List[n];
	        for (int i = 0; i < n; i++) {
	            sequences[i] = new ArrayList<>();
	        }
	        int lastAnswer = 0;
	        for (int i = 0; i < q; i++) {
	            int t = in.nextInt();
	            int x = in.nextInt();
	            int y = in.nextInt();
	            List<Integer> sequence = sequences[(x^lastAnswer)%n];
	            if(t==1) {
	            	sequence.add(y);
	            }
	            else if(t==2) {
	            	lastAnswer = sequence.get(y%sequence.size());
                    System.out.println(lastAnswer);
	            }
	        }
	        in.close();
	    }
}
