package search;

import node.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

import static operations.BinaryTreeOperations.insertNode;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private static Node root;

    @Test
    void testSearch() {
        buildTree();
        assertTrue(BinarySearch.search('a', root));
        assertTrue(BinarySearch.search('A', root));
        assertFalse(BinarySearch.search('ß', root));
    }

    private static void buildTree(){
        var alphabet = List.of('a', 'b', 'a', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p','q', 'r', 's', 't', 'u','v','w','x','y','z');
        alphabet.forEach(character -> root = insertNode(root, Character.toUpperCase(character)));
    }
}