package trees;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return  solveBinarySearch(nums, 0, nums.length-1);
    }

    static TreeNode solveBinarySearch(int[] nums, int left, int right){
        if(left>right) return null;
        int mid = left + (right-left)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = solveBinarySearch(nums, left, mid-1);
        node.right = solveBinarySearch(nums, mid+1, right);
        return node;
    }
}
