public class Node {
    private final String  value;
    private final Node prev;

    public Node(String value, Node prev){
        this.value = value;
        this.prev = prev;
    }

    public String getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }

    public String toString() {
        return value;
    }
}
