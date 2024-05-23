package ex3;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;

public class MulticonjuntoSet<T> implements Multiconjunto<T> {
    private HashSet<T> uniqueElements;
    private ArrayList<T> elements;

    public MulticonjuntoSet() {
        this.uniqueElements = new HashSet<>();
        this.elements = new ArrayList<>();
    }

    @Override
    public void add(T element) {
        uniqueElements.add(element);
        elements.add(element);
    }

    @Override
    public boolean equals(Multiconjunto<T> m) {
        return this.elements.equals(m.getElements());
    }

    @Override
    public void addAll(Multiconjunto<T> m) {
        for (T element : m.getElements()) {
            this.add(element);
        }
    }

    @Override
    public Collection<T> getElements() {
        return elements;
    }
}
