import node.Node;

import java.util.List;

import static operations.BinaryTreeOperations.insertNode;
import static search.BinarySearch.search;
import static traverse.Traverse.traverseRecursivelyInOrder;
import static traverse.Traverse.traverseWithStackInOrder;
import static treeprinter.TreePrinter.print;
import static utils.TreeUtils.*;

class SelfBalancedBinaryTree {

    private static Node root;

    public static void main(String[] args) {
        buildTree();

        System.out.println("Recursion-based traverse in order:");
        traverseRecursivelyInOrder(root);
        System.out.println("\nStack based traverse in order:");
        traverseWithStackInOrder(root);
        System.out.println("\nChar provided is found: " + search('a', root) + "\n");
        System.out.println(getBalancedData(root) + "\n");
        print(root);
    }

    private static void buildTree(){
        var alphabet = List.of('a', 'b', 'a', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p','q', 'r', 's', 't', 'u','v','w','x','y','z');
        alphabet.forEach(character -> root = insertNode(root, Character.toUpperCase(character)));
    }
}