package classes;

public class Pilha {
    private Object [] elements = new Object[10];
    private int quant = 0;

    public boolean isEmpty() {
        return this.quant == 0;
    }

    public int length() {
        return this.quant;
    }

    public void push(Object element) {
        this.elements[quant] = element;
        this.quant++;
    }

    public Object top() {
        return this.elements[quant-1];
    }

    public Object pop() {
        Object top = this.top();

        this.quant--;

        return top;
    }

}
