package arrays;

public class LeftRotation {

	static int[] rotLeft(int[] a, int d) {
        int l = a.length;
        int arr[] = new int[l];
        for(int i = 0; i<l; i++){
            int idx;
            if(i-d<0){
                idx = i-d+l;
            }
            else{
                idx = i-d;
            }
            arr[idx] = a[i];
        }
        return arr;
    }
	
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5};
		int resArr[] =rotLeft(data, 4);
		for (int  i = 0 ; i<data.length; i++) {
			System.out.print(resArr[i]);
		}
	}

}
