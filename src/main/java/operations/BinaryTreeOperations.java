package operations;

import node.Node;

public class BinaryTreeOperations {

    public static Node insertNode(Node node, char item) {
        if (node == null)
            return (new Node(item));
        if (item < node.getValue())
            node.setLeft(insertNode(node.getLeft(), item));
        else if (item > node.getValue())
            node.setRight(insertNode(node.getRight(), item));
        else
            return node;

        node.setHeight(1 + max(height(node.getLeft()), height(node.getRight())));
        var balanceFactor = getBalanceFactor(node);
        if (balanceFactor > 1) {
            if (item < node.getLeft().getValue()) {
                return rightRotate(node);
            } else if (item > node.getLeft().getValue()) {
                node.setLeft(leftRotate(node.getLeft()));
                return rightRotate(node);
            }
        }
        if (balanceFactor < -1) {
            if (item > node.getRight().getValue()) {
                return leftRotate(node);
            } else if (item < node.getRight().getValue()) {
                node.setRight(rightRotate(node.getRight()));
                return leftRotate(node);
            }
        }
        return node;
    }

    private static int height(Node node) {
        if (node == null)
            return 0;
        return node.getHeight();
    }

    private static int max(int a, int b) {
        return Math.max(a, b);
    }

    private static Node rightRotate(Node y) {
        var x = y.getLeft();
        var subTree = x.getRight();
        x.setRight(y);
        y.setLeft(subTree);
        y.setHeight(max(height(y.getLeft()), height(y.getRight())) + 1);
        x.setHeight(max(height(x.getLeft()), height(x.getRight())) + 1);
        return x;
    }

    private static Node leftRotate(Node x) {
        var y = x.getRight();
        var subTree = y.getLeft();
        y.setLeft(x);
        x.setRight(subTree);
        x.setHeight(max(height(x.getLeft()), height(x.getRight())) + 1);
        y.setHeight(max(height(y.getLeft()), height(y.getRight())) + 1);
        return y;
    }

    private static int getBalanceFactor(Node node) {
        if (node == null)
            return 0;
        return height(node.getLeft()) - height(node.getRight());
    }


}
