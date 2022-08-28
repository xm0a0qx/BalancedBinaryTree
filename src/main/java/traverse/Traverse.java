package traverse;

import node.Node;

import java.util.Stack;

public class Traverse {
    public static void traverseRecursivelyInOrder(Node node) {
        if (node != null) {
            traverseRecursivelyInOrder(node.getLeft());
            System.out.print(node.getValue() + " ");
            traverseRecursivelyInOrder(node.getRight());
        }
    }

    public static void traverseWithStackInOrder(Node root)
    {
        if (root == null)
            return;

        Stack<Node> stack = new Stack<>();
        Node currentNode = root;

        while (currentNode != null || stack.size() > 0) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.getLeft();
            }
            currentNode = stack.pop();
            System.out.print(currentNode.getValue() + " ");
            currentNode = currentNode.getRight();
        }
    }
}
