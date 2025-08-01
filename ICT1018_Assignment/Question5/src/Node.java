// Create node for linked list
public class Node {
    private int number;
    private Node previous;

    // Node constructor
    public Node(int number) {
        this.number = number;
        this.previous = null;
    }

    // Node constructor
    public Node(int number, Node previous) {
        this.number = number;
        this.previous = previous;
    }

    // Get previous node
    public Node getPrevious() {
        return this.previous;
    }

    // Get item stored in node
    public int getNumber() {
        return this.number;
    }
}
