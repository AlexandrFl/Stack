public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println("*** Стек ***");

        stack.print();

        System.out.println(" - Добавляем 2 - ");
        stack.push("2");
        stack.print();

        System.out.println(" - Добавляем 5 - ");
        stack.push("5");
        stack.print();

        System.out.println(" - Добавляем 9 - ");
        stack.push("9");
        stack.print();

        System.out.println(" - Удаляем 9 - ");
        stack.pop();
        stack.print();

        System.out.println(" - Добавляем 1 - ");
        stack.push("1");
        stack.print();

        System.out.println(" - Удаляем 1 - ");
        stack.pop();
        stack.print();

        System.out.println(" - Удаляем 5 - ");
        stack.pop();
        stack.print();

        System.out.println(" - Удаляем 2 - ");
        stack.pop();
        stack.print();

        System.out.println(" - Удаляем - ");
        stack.pop();
        stack.print();
    }
}
