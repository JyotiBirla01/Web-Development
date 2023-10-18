
import java.util.ArrayList;
import java.util.List;
 class GenericStack<T> {
    private List<T> stack;

    public GenericStack() {
        stack = new ArrayList<>();
    }

    // Push an item onto the stack
    public void push(T item) {
        stack.add(item);
    }

    // Pop an item from the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    // Peek at the top item of the stack without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Get the size of the stack
    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        System.out.println("Stack size: " + intStack.size());
        System.out.println("Top element: " + intStack.peek());

        while (!intStack.isEmpty()) {
            System.out.println("Popped: " + intStack.pop());
        }
    }
}
