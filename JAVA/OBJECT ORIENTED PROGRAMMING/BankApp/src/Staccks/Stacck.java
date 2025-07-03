package Staccks;

public class Stacck {
    private boolean status = true;
    private String[] Stack;
    private int count = 0;

    public Stacck(int size) {
        Stack = new String[size];
    }
    public boolean isEmpty() {
        return count == 0;
    }
    public void push(String list) {
        Stack[count++] = list;
    }

    public String pop() {
        return Stack[--count];
    }

    public boolean isFull() {
        return count == Stack.length;
    }
}
