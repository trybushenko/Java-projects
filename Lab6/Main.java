package Lab6;

import java.util.Arrays;
import java.util.Comparator;

// C13 = 9332 % 13 = 11
//Task: fulfill a van with coffee on a certain budget, that can be in different physical states(beans, ground).
// Take into account an amount of coffee with packaging. Sort goods with relation of mass to price.
// Find a good in the van, that corresponds to the range quality of coffee.
public class Main {
    public static void main(String[] args) throws Exception {
        //creating a wallet
        Wallet wallet = new Wallet(100);
        // creating the first bottle of coffee
        Bottle_of_coffee bottle_of_coffee = new Bottle_of_coffee(Coffee.TYPE.ARABICA, Coffee.QUALITY.EXCELLENT);
        //setting size of bottle
        bottle_of_coffee.setSize(Bottle_of_coffee.SIZE.BIG);
        //getting to know how much bottle costs
        System.out.println("One " + bottle_of_coffee.getSize() + " " + bottle_of_coffee.getType() + " coffee" + " costs " +
                "" + bottle_of_coffee.getPriceForBottle());
        // creating the second bottle of coffee
        Bottle_of_coffee bottle_of_coffee1 = new Bottle_of_coffee(Coffee.TYPE.ROBUSTA, Coffee.QUALITY.EXCELLENT);
        //setting size of bottle
        bottle_of_coffee1.setSize(Bottle_of_coffee.SIZE.BIG);
        //getting to know how much bottle costs
        System.out.println("One " + bottle_of_coffee1.getSize() + " " + bottle_of_coffee1.getType() + " coffee" + " costs " +
                "" + bottle_of_coffee1.getPriceForBottle());
        // creating the third bottle of coffee
        Bottle_of_coffee bottle_of_coffee2 = new Bottle_of_coffee(Coffee.TYPE.ARABICA, Coffee.QUALITY.EXCELLENT);
        //setting size of bottle
        bottle_of_coffee2.setSize(Bottle_of_coffee.SIZE.MEDIUM);
        //getting to know how much bottle costs
        System.out.println("One " + bottle_of_coffee2.getSize() + " " + bottle_of_coffee2.getType() + " coffee" + " costs " +
                "" + bottle_of_coffee2.getPriceForBottle());
        //creating an array out of 3 bottles
        Bottle_of_coffee[] bottle_of_coffees = new Bottle_of_coffee[3];
        bottle_of_coffees[0] = bottle_of_coffee;
        bottle_of_coffees[1] = bottle_of_coffee1;
        bottle_of_coffees[2] = bottle_of_coffee2;
        //sorting by price
        Arrays.sort(bottle_of_coffees, Comparator.comparing(Bottle_of_coffee::getPriceForBottle));
        // creating a calculator
        Calculator calculator = new Calculator();
        // calculating if I can afford all the bottles according to my budget. Output: Yes, I can contain all of them
        System.out.println(calculator.calculateHowMuchBottlesCanGetInTheVan(wallet, bottle_of_coffees));
        //creating the fourth bottle of coffee
        Bottle_of_coffee bottle_of_coffee3 = new Bottle_of_coffee(Coffee.TYPE.ARABICA, Coffee.QUALITY.EXCELLENT);
        //setting size of bottle
        bottle_of_coffee3.setSize(Bottle_of_coffee.SIZE.BIG);
        //getting to know how much bottle costs
        System.out.println("One " + bottle_of_coffee3.getSize() + " " + bottle_of_coffee3.getType() + " coffee" + " costs " +
                "" + bottle_of_coffee3.getPriceForBottle());
        //adding the fourth element to the array of bottles
        GrowArray growArray = new GrowArray();
        bottle_of_coffees = growArray.growArray(bottle_of_coffees, bottle_of_coffee3);
        Arrays.sort(bottle_of_coffees, Comparator.comparing(Bottle_of_coffee::getPriceForBottle));
        int quantity = calculator.calculateHowMuchBottlesCanGetInTheVan(wallet, bottle_of_coffees);
        Van van = new Van();
        van.addBottleToTheVan(bottle_of_coffees, quantity);
        System.out.println(Arrays.toString(calculator.findAllElementsWithCertainQuality(bottle_of_coffees, Coffee.QUALITY.EXCELLENT)));
    }
}
