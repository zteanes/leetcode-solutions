class MaxDepthBinary {
    /**
     * Solution to problem in max_depth_binary.txt. 
     * Given a root node, determines the maximal depth of the tree.
     * @param root
     * @return
     */
    public static void main(String[] args){
        MaxDepthBinary sol = new MaxDepthBinary();
        // make a test tree
        MaxDepthBinary.TreeNode root = sol.new TreeNode(3, sol.new TreeNode(9), 
                                sol.new TreeNode(20, sol.new TreeNode(15),  sol.new TreeNode(7)));
        
        assert sol.maxDepth(root) == 3; 
    }

    public int maxDepth(TreeNode root) {
        // invalid root means not depth to the tree
        if(root == null) 
            return 0;

        // recursively call with the left and right child
        int left = maxDepth(root.l);
        int right = maxDepth(root.r);

        // return the max of the two found + 1 since it doesn't count the root
        return Math.max(left, right) + 1;
    }

    public class TreeNode {
        /* Parts of the tree node objects */
        int value; // value inside of the node
        TreeNode l; // left child
        TreeNode r; // right child
        
        /**
         * Constructor for the tree node class when no value is given.
         */
        TreeNode() {}

        /**
         * Constructor for the tree node class when a value is given to be 
         * set.
         * 
         * @param val value of the tree node
         */
        TreeNode(int val) {
            this.value = val;
        }

        /**
         * Constructor for the tree node class when a value for the node
         * as well as left and right children are given.
         * 
         * @param val value for the tree node
         * @param left left child
         * @param right right child
         */
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.value = val;
            this.l = left;
            this.r = right;
        }

    }
}