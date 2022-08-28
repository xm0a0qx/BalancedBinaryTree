package operations;

import node.Node;
import org.junit.jupiter.api.Test;
import search.BinarySearch;
import utils.TreeUtils;

import java.util.List;

import static operations.BinaryTreeOperations.insertNode;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinaryTreeOperationsTest {

    private static Node root;

    @Test
    void testInsertUppercaseChar() {
        root = BinaryTreeOperations.insertNode(root, 'A');
        assertTrue(BinarySearch.search('A', root));
    }

    @Test
    void testInsertLowercaseChar() {
        root = BinaryTreeOperations.insertNode(root, 'b');
        assertFalse(BinarySearch.search('B', root));
    }

    @Test
    void testInsertBalancedTree() {
        assertTrue(TreeUtils.getBalancedData(root).isBalanced());
    }
}