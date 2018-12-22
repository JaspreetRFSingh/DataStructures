package arrays;

public class DSArray1D {

	static int[] reverseArray(int[] a) {
        int n= a.length;
        int[] ra = new int[n];
        for(int i = 0; i < n; i++){
            ra[i] = a[n-1-i];
        }
        return ra;
    }
	public static void main(String[] args) {
		int [] arr = {3, 5,6, 9};
		int [] data = reverseArray(arr);
		for(int i =0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
		

	}

}
