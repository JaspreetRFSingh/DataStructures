package arrays;

public class SparseArrays {

	static int[] matchingStrings(String[] strings, String[] queries) {
        int ns = strings.length;
        int qlen = queries.length;
        int []result = new int[qlen];
        for(int i =0; i<qlen; i++){
            int countTemp = 0;
            for(int j=0; j<ns; j++){
                if(strings[j].equals(queries[i])){
                    countTemp++;
                }
            }
            result[i] = countTemp;
        }
        return result;
    }
	
	public static void main(String[] args) {
		String[] str = {"aba","baba", "aba","xzxb"};
		String[] queries = {"aba", "xzxb", "ab"};
		int[] result = matchingStrings(str, queries);
		for(int i=0 ;i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}

}
