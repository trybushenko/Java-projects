package Lab6_modificated;



public class Van {
    private int capacity;
    public Van() {
        capacity = 10;
    }
    public BottleOfCoffee[] addBottleToTheVan(BottleOfCoffee[] bottle_of_coffees, int quantity_of_bottles) throws Exception {
        BottleOfCoffee[] loaded = new BottleOfCoffee[quantity_of_bottles];
        for (int i = 0; i < quantity_of_bottles; i++) {
            if (bottle_of_coffees[i].getSize().equals(BottleOfCoffee.SIZE.SMALL)) {
                if (capacity < 1) throw new Exception("Van is full");
                else capacity--;
            }
            else if (bottle_of_coffees[i].getSize().equals(BottleOfCoffee.SIZE.MEDIUM)){
                if (capacity < 2) throw new Exception("Van is full or try to put one more SMALL bottle");
                else capacity -= 2;
            }
            else {
                if (capacity <= 4) throw new Exception("---Van is full or try to put one more SMALL or MEDIUM bottle---");
                else capacity -= 5;
            }
        }
        System.out.println("------LOADING PASSED SUCCESSFULLY------");
        if (quantity_of_bottles >= 0) System.arraycopy(bottle_of_coffees, 0, loaded, 0, quantity_of_bottles);
        return loaded;
    }
    public GroundCoffee[] addBagToTheVan(BagOfCoffee[] groundCoffees, int quantityOfBags) throws Exception{
        GroundCoffee[] loaded = new GroundCoffee[quantityOfBags];
        for (int i = 0; i < quantityOfBags; i++) {
            if (groundCoffees[i].getKilograms() == GroundCoffee.KILOGRAMS.FIFTY) {
                if (capacity < 3) throw new Exception("Van is full");
                else capacity -= 3;
            }
            else {
                if (capacity < 5) throw new Exception("Van is full or try to put fifty kilograms bag" + "you can load" + i + "values");
                else capacity -= 5;
            }
        }
        System.out.println("------LOADING PASSED SUCCESSFULLY------");
        if (quantityOfBags >= 0) System.arraycopy(groundCoffees, 0, loaded, 0, quantityOfBags);
        return loaded;
    }
    public CoffeeInPackets[] addBoxOfPacketsToTheVan(BoxOfPacketsOfCoffee[] boxOfPacketsOfCoffees, int quantityOfPackets) throws Exception {
        CoffeeInPackets[] loaded = new CoffeeInPackets[quantityOfPackets];
        for (int i = 0; i < quantityOfPackets; i++) {
            if (boxOfPacketsOfCoffees[i].getSize() == BoxOfPacketsOfCoffee.SIZE.SMALL) {
                if (capacity < 3) throw new Exception("Van is full");
                else capacity -= 3;
            }
            else {
                if (capacity < 5) throw new Exception("Van is full or try to put small box, " + "you load only " + i + " Boxes");
                else capacity -= 5;
            }
        }
        System.out.println("------LOADING PASSED SUCCESSFULLY------");
        if (quantityOfPackets >= 0) System.arraycopy(boxOfPacketsOfCoffees, 0, loaded, 0, quantityOfPackets);
        return loaded;
    }
}
