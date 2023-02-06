package Seminar3.HW3;

import java.util.Iterator;

public class LinkList<E> implements Iterable<E> {
    private final Node<E> item;
    private int counter = 0;

    public LinkList() {
        item = new Node<>();
    }

    public void add(E element) {
        if (counter == 0) {
            item.set(element);
        } else {
            item.add(element);
        }
        counter++;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkIterator(item);
    }

    private static class Node<E> {
        private E element;
        private Node<E> next = null;

        Node() {
        }

        Node(E element) {
            set(element);
        }

        void set(E element) {
            this.element = element;
        }

        void add(E element) {
            if (isNext()) {
                next.add(element);
            } else {
                next = new Node<E>(element);
            }
        }

        E get(){
            return element;
        }

        boolean isNext() {
            return next != null;
        }
    }

    private class LinkIterator implements Iterator<E> {
        private Node<E> current;
        private int index = 0;

        LinkIterator(Node<E> node) {
            current = node;
        }

        @Override
        public boolean hasNext() {
            return index < counter;
        }

        @Override
        public E next() {
            if (index == 0) {
                index++;
                return current.get();
            }
            index++;
            current = current.next;
            return current.get();
        }
    }
}
