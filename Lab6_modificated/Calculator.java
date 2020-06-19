package Lab6_modificated;


import Lab6.Bottle_of_coffee;

public class Calculator {
    public int calculateHowManyBagsCanGetInTheVan(Wallet wallet, BagOfCoffee[] bagOfCoffees) {
        int count = 0;
        int counter = 0;
        for (BagOfCoffee bottle : bagOfCoffees) {
            if (bottle == null) break;
            else {
                count++;
                counter += bottle.getPriceForBag();
                System.out.println("You take one " + bottle.getType() + " " + bottle.getKilograms() + " coffee");
                if (counter > wallet.getMoney()) {
                    count--;
                    break;
                }
            }
        }
        System.out.println("You can take " + count + " bottles that I counted earlier");
        return count;
    }

    public int calculateHowManyBottlesCanGetInTheVan(Wallet wallet, BottleOfCoffee[] bottleOfCoffees) {
        int count = 0;
        int counter = 0;
        for (BottleOfCoffee bottle : bottleOfCoffees) {
            if (bottle == null) break;
            else {
                count++;
                counter += bottle.getPriceForBottle();
                System.out.println("You take one " + bottle.getType() + " " + bottle.getSize() + " coffee");
                if (counter > wallet.getMoney()) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
    public int calculateHowManyBoxOfPacketsCanGetInTheVan(Wallet wallet, BoxOfPacketsOfCoffee[] boxOfPacketsOfCoffees) {
        int count = 0;
        int counter = 0;
        for (BoxOfPacketsOfCoffee bottle : boxOfPacketsOfCoffees) {
            if (bottle == null) break;
            else {
                count++;
                counter += bottle.getPriceOfBox();
                System.out.println("You take one " + bottle.getType() + " " + bottle.getSize() + " coffee");
                if (counter > wallet.getMoney()) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
