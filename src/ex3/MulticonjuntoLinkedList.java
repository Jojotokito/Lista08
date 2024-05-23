package ex3;

import java.util.LinkedList;
import java.util.Collection;

public class MulticonjuntoLinkedList<T> implements Multiconjunto<T> {
    private LinkedList<T> elements;

    public MulticonjuntoLinkedList() {
        this.elements = new LinkedList<>();
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
