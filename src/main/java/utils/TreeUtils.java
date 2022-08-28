package utils;

import node.Node;
import utils.data.BalancedTreeData;

public class TreeUtils {

    private static final int BALANCED_TREE_HEIGHT = -1;
    private static final int BALANCED_TREE_DEPTH = -1;

    public static BalancedTreeData getBalancedData(Node tree) {
        return isBinaryTreeBalanced(tree, BALANCED_TREE_DEPTH);
    }

    private static BalancedTreeData isBinaryTreeBalanced(Node tree, int depth) {
        if (tree == null) {
            return new BalancedTreeData(true, BALANCED_TREE_HEIGHT);
        }

        var leftSubtree = isBinaryTreeBalanced(tree.getLeft(), depth + 1);
        var rightSubtree = isBinaryTreeBalanced(tree.getRight(), depth + 1);

        var isBalanced = Math.abs(leftSubtree.getHeight() - rightSubtree.getHeight()) <= 1;
        var subtreesAreBalanced = leftSubtree.isBalanced() && rightSubtree.isBalanced();
        var height = Math.max(leftSubtree.getHeight(), rightSubtree.getHeight()) + 1;

        return new BalancedTreeData(isBalanced && subtreesAreBalanced, height);
    }
}
