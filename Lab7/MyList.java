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
                Bottle_of_coffee coffee = currentNode.getBottleOfCoffee();
                currentNode = currentNode.getNext();
                return coffee;
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
        int temp = 0;
        for (Bottle_of_coffee bottle_of_coffee : this) {
            if (bottle_of_coffee == o) this.remove(temp);
            temp++;
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            for (Bottle_of_coffee bottle_of_coffee : this) {
                if (o == bottle_of_coffee) {
                }
                else return false;
            }
        }
        return true;
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
        if (index < 0 || index > size()) throw new IndexOutOfBoundsException();
        for (Bottle_of_coffee bottle_of_coffee : c) {
            if (bottle_of_coffee == null) throw new NullPointerException();
        }
        for (Bottle_of_coffee bottle_of_coffee : c) {
            this.add(index, bottle_of_coffee);
            index++;
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        int length = 0;
        for (Object o : c) {
            this.removeIf(bottle_of_coffee -> o == bottle_of_coffee);
            length++;
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
        
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
        return new Bottle_of_coffee(Coffee.TYPE.ARABICA, Coffee.QUALITY.BAD);
    }

    @Override
    public void add(int index, Bottle_of_coffee element) {
        Node prevNode = head;
        Node nextNode = null;
        int temp = 0;
        while (temp != index - 1) {
            prevNode = prevNode.getNext();
            temp++;
        }
        for (int i = 0; i < 2; i++) {
            nextNode = prevNode.getNext();
        }
        Node nodeToAdd= new Node(element, nextNode, prevNode);
        prevNode.setNext(nodeToAdd);
        nextNode.setPrevious(nodeToAdd);
        size++;
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
        } else if (index == size - 1) {
            currNode = tail;
            tail = tail.getPrevious();
            tail.setNext(null);
        } else {
            while (temp != index - 1) {
                prevNode = prevNode.getNext();
                temp++;
            }
            for (int i = 0; i < 2; i++) {
                nextNode = prevNode.getNext();
            }
            currNode = prevNode.getNext();
            prevNode.setNext(nextNode);
            nextNode.setPrevious(nextNode);
            currNode.setNext(null);
            currNode.setPrevious(null);
            size--;
        }
        return currNode.getBottleOfCoffee();
    }

    @Override
    public int indexOf(Object o) {
        int temp = 0;
        Node currNode = head;
        while (currNode != o) {
            temp++;
            currNode = currNode.getNext();
        }
        return temp;
    }

    @Override
    public int lastIndexOf(Object o) {
        int temp = size - 1;
        int lastIndex = 0;
        if (!(o instanceof Bottle_of_coffee)) throw new ClassCastException();
        for (int i = size - 1; i >= 0; i--) {
            if (o == this.get(i)) lastIndex = temp;
            temp--;
        }
        return lastIndex;
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
        SubList sublist = new SubList((MyList<Bottle_of_coffee>) this, fromIndex, toIndex);
        return sublist.createASubList();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Bottle_of_coffee bottle_of_coffee : this) {
            stringBuilder.append(" ").append(bottle_of_coffee.toString()).append(" \n");
        }
        return stringBuilder.toString();
    }
}