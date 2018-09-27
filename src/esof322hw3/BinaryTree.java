package esof322hw3;

/**
 *  ESOF 322 HW 3
 * @author Karl Molina, Dana Parker
 */
public class BinaryTree {
    private Node root;
    
    public BinaryTree(Node root) {
        this.root = root;
    }
    
    /**
     * Adds the node to the tree
     * @param n 
     */
    public void addNode(Node n) {
        addNode(n, root);
    }
    
    /**
     * Recursive helper function to add the node to the correct spot in the tree
     * @param n
     * @param current 
     */
    private void addNode(Node n, Node current) {
        if (n.getValue() < current.getValue()) {
            if (current.getLeft() == null) {
                current.setLeft(n);
            } else {
                addNode(n, current.getLeft());
            }
        } else {
            if (current.getRight() == null) {
                current.setRight(n);
            } else {
                addNode(n, current.getRight());
            }
        }
    }
}

/**
 * Node class that holds a value and left and right children
 * @author h89q624
 */
class Node {
    private Node left, right;
    private int value;
    
    /**
     * Initializes a Node with the value
     * @param value 
     */
    public Node(int value) {
        this.value = value;
    }
    
    /**
     * Gets the node's value
     * @return
     */
    public int getValue() {
        return value;
    }
    
    /**
     * Gets the node's left child
     * @return 
     */
    public Node getLeft() {
        return left;
    }
    
    /**
     * Gets the node's right child
     * @return 
     */
    public Node getRight() {
        return right;
    }
    
    /**
     * Sets the node's right child
     * @param n 
     */
    public void setRight(Node n) {
        right = n;
    }
    
    /**
     * Sets the node's left child
     * @param n 
     */
    public void setLeft(Node n) {
        left = n;
    }
}