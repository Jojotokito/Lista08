package ex3;

import java.util.ArrayList;
import java.util.Collection;

public class MulticonjuntoArrayList<T> implements Multiconjunto<T> {
    private ArrayList<T> elements;

    public MulticonjuntoArrayList() {
        this.elements = new ArrayList<>();
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
