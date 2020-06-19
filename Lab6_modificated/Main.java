package Lab6_modificated;


import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws Exception {
        Wallet wallet = new Wallet(200);
        BoxOfPacketsOfCoffee boxOfPacketsOfCoffee = new BoxOfPacketsOfCoffee(Coffee.QUALITY.BAD, Coffee.TYPE.ARABICA, BoxOfPacketsOfCoffee.SIZE.SMALL);
        BoxOfPacketsOfCoffee boxOfPacketsOfCoffee1 = new BoxOfPacketsOfCoffee(Coffee.QUALITY.EXCELLENT, Coffee.TYPE.ROBUSTA, BoxOfPacketsOfCoffee.SIZE.BIG);
        BoxOfPacketsOfCoffee boxOfPacketsOfCoffee2 = new BoxOfPacketsOfCoffee(Coffee.QUALITY.GOOD, Coffee.TYPE.ARABICA, BoxOfPacketsOfCoffee.SIZE.SMALL);
        BoxOfPacketsOfCoffee[] boxOfPacketsOfCoffees = new BoxOfPacketsOfCoffee[]{
                boxOfPacketsOfCoffee,
                boxOfPacketsOfCoffee1,
                boxOfPacketsOfCoffee2
        };
        Calculator calculator = new Calculator();
        int quantity = calculator.calculateHowManyBoxOfPacketsCanGetInTheVan(wallet, boxOfPacketsOfCoffees);
        System.out.println(quantity);
        Van van = new Van();
        Arrays.sort(boxOfPacketsOfCoffees, Comparator.comparing(BoxOfPacketsOfCoffee::getPriceOfBox));
        van.addBoxOfPacketsToTheVan(boxOfPacketsOfCoffees, quantity);
    }
}
