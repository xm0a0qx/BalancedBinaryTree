package utils.data;

public record BalancedTreeData(boolean isBalanced, int height) {

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "TreeBalanceData -> " +
                "isBalanced=" + isBalanced +
                ", height=" + height;
    }
}
