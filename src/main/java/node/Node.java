package node;

public class Node {
    private static final int DEFAULT_TREE_HEIGHT = 1;
    private char value;
    private int height;
    private Node left, right;

    public Node(char value) {
        this.value = value;
        height = DEFAULT_TREE_HEIGHT;
    }

    public Node(char value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
