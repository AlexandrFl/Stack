public class Stack {
    private static Node head;
    private static Node node;

    public void push(String value) {
        if (head == null) {
            head = new Node(value, null);
        } else {
            node = new Node(value, head);
            head = node;
        }
    }

    public void pop() {
        if (head == null) {
            System.out.println("Нет элементов для удаления");
        } else {
            head = head.getPrev();
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("** Stack пуст **");
        } else {
            node = head;
            while (node != null) {
                System.out.print(node.getValue());
                if (node.getPrev() != null) {
                    System.out.print(" -> ");
                }
                node = node.getPrev();
            }
        }
        System.out.println();
    }
}
