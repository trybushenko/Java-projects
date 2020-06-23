package Lab7;

import Lab6.Bottle_of_coffee;

public class Node {
    private Bottle_of_coffee coffee;
    private Node next;
    private Node previous;

    public Node(Bottle_of_coffee coffee, Node next, Node previous) {
        this.coffee = coffee;
        this.next = next;
        this.previous = previous;
    }

    public Bottle_of_coffee getBottleOfCoffee() {
        return coffee;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setBottleOfCoffee(Bottle_of_coffee coffee) {
        this.coffee = coffee;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

}