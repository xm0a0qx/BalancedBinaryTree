package utils;

import node.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.data.BinaryTreeDataProvider;

class TreeUtilsTest extends BinaryTreeDataProvider {

    @Test
    public void givenBalancedTrees_whenCallingIsBalanced_ShouldReturnTrue() {

        for (Node node : balancedTrees()) {
            Assertions.assertTrue(TreeUtils.getBalancedData(node).isBalanced());
        }
    }

    @Test
    public void givenUnbalancedTrees_whenCallingIsBalanced_ShouldReturnFalse() {
        for (Node node : unbalancedTrees()) {
            Assertions.assertFalse(TreeUtils.getBalancedData(node).isBalanced());
        }
    }
}