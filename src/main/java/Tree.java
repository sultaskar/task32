import java.util.HashSet;
import java.util.Set;

public class Tree {

    Node root;


    public void insert(int key, String data) {
        Node node = new Node();
        node.key = key;
        node.data = data;
        if (root == null) {
            root = node;
        } else {
            Node current = root;
            Node prev = null;
            while (true) {
                prev = current;
                if (key < prev.key) {
                    current = current.leftChild;
                    if (current == null) {
                        prev.leftChild = node;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        prev.rightChild = node;
                        return;
                    }
                }
            }
        }
    }

    public void print(Node startNode) {
        if (startNode != null) {
            print(startNode.leftChild);
            startNode.printNode();
            print(startNode.rightChild);
        }
    }

    public Node find(int key) {
        Node current = root;
        while (current.key != key) {
            if (current.key < key) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public int findLeafs(Node n) {
        Node current = n;
        if (n == null) {
            return 0;
        }
        if ((current.leftChild == null) && (current.rightChild == null)) {
            return 1;
        }
        return findLeafs(current.leftChild) + findLeafs(current.rightChild);
    }
}
