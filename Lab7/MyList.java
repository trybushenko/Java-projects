package Lab7;

import Lab6.Bottle_of_coffee;
import Lab6.Coffee;

import java.util.*;

public class MyList<E> implements List<Bottle_of_coffee> {
    private int size;
    private Node head;
    private Node tail;

    public MyList() {
    }

    public MyList(Bottle_of_coffee coffee) {
        add(coffee);
    }

    public MyList(Collection<? extends Bottle_of_coffee> collection) {
        addAll(collection);
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Bottle_of_coffee coffee : this) {
            if (coffee.equals(o)) return true;
        }
        return false;
    }

    @Override
    public Iterator<Bottle_of_coffee> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<Bottle_of_coffee> {
        protected Node currentNode = head;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public Bottle_of_coffee next() {
            try {
                Bottle_of_coffee flower = currentNode.getBottleOfCoffee();
                currentNode = currentNode.getNext();
                return flower;
            } catch (NullPointerException e) {
                throw new NoSuchElementException();
            }
        }
    }

    @Override
    public Object[] toArray() {
        Object[] objects = new Object[size];
        for (int i = 0; i < size; i++) {
            objects[i] = this.get(i);
        }
        return objects;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        Object[] temp = new Object[a.length];
        for (int i = 0; i < a.length; i++) {
            temp[i] = this.get(i);
        }
        return (T[]) temp;
    }

    @Override
    public boolean add(Bottle_of_coffee bottle_of_coffee) {
        Node node = new Node(bottle_of_coffee, null, tail);
        if (head == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Bottle_of_coffee> c) {
        boolean isCollectionChanged = false;
        for (Bottle_of_coffee bottle_of_coffee : c) {
            isCollectionChanged |= add(bottle_of_coffee);
        }
        return isCollectionChanged;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Bottle_of_coffee> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Bottle_of_coffee get(int index) {
        if (index < 0 || index >= size()) throw new IndexOutOfBoundsException();
        int counter = 0;
        Node temp = head;
        while (temp != null && counter != index) {
            temp = temp.getNext();
            counter++;
        }
        assert temp != null;
        return temp.getBottleOfCoffee();
    }

    @Override
    public Bottle_of_coffee set(int index, Bottle_of_coffee element) {
        return null;
    }

    @Override
    public void add(int index, Bottle_of_coffee element) {
        Node prevNode = head;
        int counter = 0;
        while (counter != index - 1) {

        }
    }

    @Override
    public Bottle_of_coffee remove(int index) {
        if (index < 0 || index >= size()) throw new IndexOutOfBoundsException();
        int temp = 0;
        Node prevNode = head;
        Node nextNode = null;
        Node currNode;
        if (index == 0) {
            currNode = head;
            head = head.getNext();
            head.setPrevious(null);
        }
        else if (index == size - 1) {
            currNode = tail;
            tail = tail.getPrevious();
            tail.setPrevious(null);
        }
        else {
            while (temp != index - 1) {
                prevNode = prevNode.getNext();
                temp++;
            }
            for (int i = 0; i < 2; i++) {
                nextNode = prevNode.getNext();
            }
            currNode = prevNode.getNext();
            prevNode.setNext(nextNode);
            nextNode.setPrevious(prevNode);
            size--;
        }
        return currNode.getBottleOfCoffee();
    }

    @Override
    public int indexOf(Object o) {
//        int temp = 0;
//        Node currNode = head;
//        while (currNode != o) {
//            temp++;
//            currNode = currNode.getNext();
//        }
//        return temp;
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Bottle_of_coffee> listIterator() {
        return new MyListIterator();
    }

    class MyListIterator extends MyIterator implements ListIterator<Bottle_of_coffee> {
        @Override
        public boolean hasPrevious() {
            return currentNode.getPrevious() != null;
        }

        @Override
        public Bottle_of_coffee previous() {
            currentNode = currentNode.getPrevious();
            return currentNode.getBottleOfCoffee();

        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(Bottle_of_coffee coffee) {

        }

        @Override
        public void add(Bottle_of_coffee coffee) {

        }
    }

    @Override
    public ListIterator<Bottle_of_coffee> listIterator(int index) {
        return null;
    }

    @Override
    public List<Bottle_of_coffee> subList(int fromIndex, int toIndex) {
        return new LinkedList<>();
    }
//    public boolean add(Bottle_of_coffee bottle_of_coffee) {
//        Node node = new Node(bottle_of_coffee, null, tail);
//        if (head == null) {
//            head = node;
//        } else {
//            tail.setNext(node);
//        }
//        tail = node;
//        size++;
//        return true;


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Bottle_of_coffee bottle_of_coffee : this) {
            stringBuilder.append(" ").append(bottle_of_coffee.toString()).append(" \n");
        }
        return stringBuilder.toString();
    }
}