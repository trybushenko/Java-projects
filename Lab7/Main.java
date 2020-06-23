package Lab7;

import Lab6.Bottle_of_coffee;
import Lab6.Coffee;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList(new Bottle_of_coffee(Coffee.TYPE.ARABICA, Coffee.QUALITY.GOOD));
        myList.add(new Bottle_of_coffee(Coffee.TYPE.ROBUSTA, Coffee.QUALITY.EXCELLENT));
        myList.add(new Bottle_of_coffee(Coffee.TYPE.ARABICA, Coffee.QUALITY.BAD));

        ArrayList<Bottle_of_coffee> arrayList = new ArrayList<>();
        arrayList.add(new Bottle_of_coffee(Coffee.TYPE.ARABICA, Coffee.QUALITY.GOOD));
        arrayList.get(0).setSize(Bottle_of_coffee.SIZE.SMALL);
        arrayList.add(new Bottle_of_coffee(Coffee.TYPE.ARABICA, Coffee.QUALITY.BAD));
        arrayList.get(1).setSize(Bottle_of_coffee.SIZE.BIG);
        arrayList.add(new Bottle_of_coffee(Coffee.TYPE.ARABICA, Coffee.QUALITY.EXCELLENT));
        arrayList.get(2).setSize(Bottle_of_coffee.SIZE.SMALL);
        arrayList.add(new Bottle_of_coffee(Coffee.TYPE.ROBUSTA, Coffee.QUALITY.BAD));
        arrayList.get(3).setSize(Bottle_of_coffee.SIZE.MEDIUM);
        MyList myList1 = new MyList(arrayList);

//        Iterator iterator = myList1.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        System.out.println("-----------------------------------");
//        ListIterator listIterator = myList1.listIterator();
//        System.out.println(listIterator.next());
//        System.out.println(listIterator.previous());


        // Lab6.Coffee@6e8cf4c6
        // Lab6.Coffee@6e8cf4c6

        System.out.println(myList1.size());
        System.out.println(myList1.get(1).toString());
        System.out.println(Arrays.toString(myList1.toArray()));
        Object[] bottle_of_coffees = new Bottle_of_coffee[myList1.size()];
        bottle_of_coffees = myList1.toArray(bottle_of_coffees);
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println(myList1.toString());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(myList1.remove(3));
        System.out.println("-----------------------------------------------------------------------------------------");
        for (Object o : myList1) {
            System.out.println(o.toString());
        }
    }
}