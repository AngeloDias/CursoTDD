package classes;

public class Pilha {
    private Object [] elements;
    private int quant = 0;

    public Pilha(int max) {
        this.elements = new Object[max];
    }

    public boolean isEmpty() {
        return this.quant == 0;
    }

    public int length() {
        return this.quant;
    }

    public void push(Object element) {

        if(this.quant == this.elements.length) {
            throw new FullStackExceptionTDD("Push operation isn't possible!");
        }

        this.elements[quant] = element;
        this.quant++;
    }

    public Object top() {
        return this.elements[quant-1];
    }

    public Object pop() {

        if(isEmpty()) {
            throw new EmptyStackExceptionTDD("Pop operation isn't possible!");
        }

        Object top = this.top();

        this.quant--;

        return top;
    }

}
