package utils.data;

import node.Node;

import java.util.Arrays;
import java.util.Collection;

public class BinaryTreeDataProvider {
    protected static Collection<Node> balancedTrees() {
        return Arrays.asList(
                null,
                leaf('a'),
                tree('a', leaf('b'), leaf('c')),
                tree(
                        'a',
                        leaf('b'),
                        tree('c', leaf('d'), null)
                ),
                tree(
                        'a',
                        tree(
                                'b',
                                tree('c', leaf('d'), null),
                                leaf('e')
                        ),
                        tree(
                                'f',
                                leaf('g'),
                                tree('h', null, leaf('i'))
                        )
                )
        );
    }

    protected static Collection<Node> unbalancedTrees() {
        return Arrays.asList(
                tree(
                        'a',
                        tree('b', leaf('c'), null),
                        null
                ),
                tree(
                        'a',
                        tree(
                                'b',
                                tree('c', leaf('d'), leaf('e')),
                                null
                        ),
                        tree('f', leaf('g'), null)
                ),
                tree(
                        'a',
                        tree('b', leaf('c'), null),
                        tree(
                                'd',
                                tree('e', leaf('f'), leaf('g')),
                                null
                        )
                )
        );
    }

    private static Node leaf(char value) {
        return new Node(value, null, null);
    }

    private static Node tree(char value, Node left, Node right) {
        return new Node(value, left, right);
    }
}
