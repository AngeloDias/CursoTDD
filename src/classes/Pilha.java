package classes;

public class Pilha {
    private Object element;
    private int quant;

    public boolean isEmpty() {
        return this.element == null;
    }

    public int length() {
        return this.quant;
    }

    public void push(Object element) {
        this.element = element;
        this.quant++;
    }

    public Object top() {
        return this.element;
    }
}
