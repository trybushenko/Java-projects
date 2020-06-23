package Lab7;

import Lab6.Bottle_of_coffee;
import Lab6.Coffee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        System.out.println("List1 to Array");
        System.out.println(Arrays.toString(myList1.toArray()));
        Object[] bottle_of_coffees = new Bottle_of_coffee[myList1.size()];
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("myList1 to string " + myList1.toString());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("remove index 2 " + myList1.remove(2));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("size " + myList1.size());
        System.out.println("---------------------------------------------------------------------------------------");
        List myList2 = myList1.subList(0, 1);
        System.out.println("SUBLIST");
        for (Object o : myList2) {
            System.out.println(o.toString());
        }
        myList1.add(1, new Bottle_of_coffee(Coffee.TYPE.ARABICA, Coffee.QUALITY.BAD));
        myList1.get(1).setSize(Bottle_of_coffee.SIZE.MEDIUM);
        System.out.println("--------------------------------------------------------------------------");
        for (Object o : myList1) {
            System.out.println(o);
        }

        System.out.println("--------------arrayList----------------------------------------------------------------------");
        for (Bottle_of_coffee bottle_of_coffee : arrayList) {
            System.out.println(bottle_of_coffee);
        }
        myList1.addAll(1,arrayList);
        System.out.println("--------------------------------------------------------------------------");
        for (Object o : myList1) {
            System.out.println(o);
        }
    }
}