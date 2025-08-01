// Create stack
public class Stack {
    private Node head; // store head of stack

    // stack constructor
    public Stack () {
        this.head = null;
    }

    // Pop topmost item in stack
    public int pop () {
        int popped = head.getNumber();
        head = head.getPrevious();
        return popped;
    }

    // Add item to stack
    public void push(int number) {
        head = new Node(number, this.head);
    }

    // Print contents of the stack
    public void print_stack() {
        System.out.println("Stack contents:");
        Node node = head;
        while (node != null) {
            System.out.println(node.getNumber());
            node = node.getPrevious();
        }
    }

    // Find amount of items in stack
    public int stack_length() {
        Node node = head;
        int total = 0;
        while (node != null) {
            total ++;
            node = node.getPrevious();
        }
        return total;
    }

    // check if stack is empty
    public void empty() {
        while (this.stack_length() != 0) {
            this.pop();
        }
    }
}
