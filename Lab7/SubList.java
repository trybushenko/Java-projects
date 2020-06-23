package Lab7;

import Lab6.Bottle_of_coffee;

public class SubList {
    private MyList<Bottle_of_coffee> bottle_of_coffees;
    private final int start, finish;

    public SubList(MyList<Bottle_of_coffee> bottle_of_coffees, int start, int finish) {
        this.bottle_of_coffees = bottle_of_coffees;
        this.start = start;
        this.finish = finish;
    }

    public MyList<Bottle_of_coffee> createASubList() {
        int temp = 0;
        MyList<Bottle_of_coffee> myListCoffees = new MyList<>();
        if (start == finish) return myListCoffees;
        else if (start < 0 || finish > bottle_of_coffees.size() || start > finish)
            throw new IndexOutOfBoundsException();
        else {
            for (Bottle_of_coffee bottle_of_coffee : bottle_of_coffees) {
                if (start <= temp && temp <= finish) {
                    myListCoffees.add(bottle_of_coffees.get(temp));
                }
                temp++;
            }
            return myListCoffees;
        }
    }
}

