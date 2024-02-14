package trees;

public class InfectedBinaryTree {
    private static int maxDistance = 0;

    public static int amountOfTime(TreeNode root, int start) {
        dfs(root, start);
        return maxDistance;
    }

    private static int dfs(TreeNode root, int start) {
        int depth = 0;
        if (root == null) {
            return depth;
        }
        int ld = dfs(root.left, start);
        int rd = dfs(root.right, start);
        if (root.val == start) {
            maxDistance = Math.max(ld, rd);
            depth = -1;
        } else if (ld >= 0 && rd >= 0) {
            depth = Math.max(ld, rd) + 1;
        } else {
            int distance = Math.abs(ld)+Math.abs(rd);
            maxDistance = Math.max(maxDistance, distance);
            depth = Math.min(ld, rd) - 1;
        }
        return depth;
    }

    public static void main(String[] args){
        //[1,5,3,null,4,10,6,9,2]
        TreeNode root = new TreeNode(1);
        TreeNode root1 = new TreeNode(5);
        TreeNode root2 = new TreeNode(3);
        TreeNode root3 = null;
        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(10);
        TreeNode root6 = new TreeNode(6);
        TreeNode root7 = new TreeNode(9);
        TreeNode root8 = new TreeNode(2);
        TreeNode roota = new TreeNode(110);
        TreeNode rootb = new TreeNode(16);
        TreeNode rootc = new TreeNode(19);
        TreeNode rootd = new TreeNode(12);
        TreeNode roote = new TreeNode(14);
        TreeNode rootf = new TreeNode(15);
        TreeNode rootg = new TreeNode(13);
        root4.left = root7;
        root4.right = root8;
        root1.right = root4;
        root1.left = root3;
        root2.left = root5;
        root2.right = root6;
        root.left = root1;
        root.right = root2;
        root8.right = roota;
        roota.right = rootb;
        rootb.right = rootc;
        rootc.right = rootd;
        rootd.right = roote;
        roote.right=rootf;
        rootf.right=rootg;
        System.out.println(amountOfTime(root, 2));
    }
}
