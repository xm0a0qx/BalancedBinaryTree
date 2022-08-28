package search;

import node.Node;

public class BinarySearch {
    public static boolean search(char value, Node root) {
        return binarySearch(root, Character.toUpperCase(value));
    }

    private static boolean binarySearch(Node root, char value) {
        if (root == null) {
            return false;
        } else if (root.getValue() == value) {
            return true;
        } else if (root.getValue() > value) {
            return binarySearch(root.getLeft(), value);
        }
        return binarySearch(root.getRight(), value);
    }
}
