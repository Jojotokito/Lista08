package ex3;

import java.util.Stack;
import java.util.Collection;

public class MulticonjuntoStack<T> implements Multiconjunto<T> {
    private Stack<T> elements;

    public MulticonjuntoStack() {
        this.elements = new Stack<>();
    }

    @Override
    public void add(T element) {
        elements.add(element);
    }

    @Override
    public boolean equals(Multiconjunto<T> m) {
        return this.elements.equals(m.getElements());
    }

    @Override
    public void addAll(Multiconjunto<T> m) {
        elements.addAll(m.getElements());
    }

    @Override
    public Collection<T> getElements() {
        return elements;
    }
}
