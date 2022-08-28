package treeprinter;

import node.Node;

public class TreePrinter {

    public static void print(Node root) {
        print("", root, false);
    }

    private static void print(String prefix, Node node, boolean isLeft) {
        if (node != null) {
            System.out.printf("%s%s%s\n",prefix,(isLeft ? "|-- " : "\\-- "), node.getValue());
            print(prefix + (isLeft ? "|   " : "    "), node.getLeft(), true);
            print(prefix + (isLeft ? "|   " : "    "), node.getRight(), false);
        }
    }
}
