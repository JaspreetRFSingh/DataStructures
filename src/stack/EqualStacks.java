package stack;

public class EqualStacks {

	static int minStackHeight(int[] heights) {
		int minHeight = Integer.MAX_VALUE;
		for(int i = 0; i < heights.length; i++) {
			minHeight = Math.min(minHeight, heights[i]);
		}
		return minHeight;
	}
	static boolean areHeightsEqual(int[] heights) {
		int height = heights[0];
		for(int h : heights) {
			if(height != h) {
				return false;
			}
		}
		return true;
	}
	static int equalStacks(int[] h1, int[] h2, int[] h3) {

        int[][] stacks = {h1, h2, h3};
        int[] heights = {0, 0, 0};
        int[] indexes = {0, 0 ,0};
        for(int i = 0; i < stacks.length; i++) {
        	for(int j = 0; j < stacks[i].length; j++) {
        		heights[i] += stacks[i][j];
        	}
        }
        
        int minHeight = minStackHeight(heights);
        
        while(!areHeightsEqual(heights)) {
        	for(int i = 0; i < stacks.length; i++) {
        		if(heights[i] > minHeight) {
        			heights[i] -= stacks[i][indexes[i]++];
        			minHeight = Math.min(minHeight, heights[i]);
        		}
        	}
        }
        
        return minHeight;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
