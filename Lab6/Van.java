package Lab6;

public class Van {
    private int capacity = 10;
    // capacity means that van can contain 10 small bottles, 5 medium and 2 big bottles
    public Van() {
    }
    public void addBottleToTheVan(Bottle_of_coffee[] bottle_of_coffees, int quantity_of_bottles) throws Exception {
        for (int i = 0; i < quantity_of_bottles; i++) {
            if (bottle_of_coffees[i].getSize().equals(Bottle_of_coffee.SIZE.SMALL)) {
                if (capacity < 1) throw new Exception("Van is full");
                else capacity--;
            }
            else if (bottle_of_coffees[i].getSize().equals(Bottle_of_coffee.SIZE.MEDIUM)){
                if (capacity < 2) throw new Exception("Van is full or try to put one more SMALL bottle");
                else capacity -= 2;
            }
            else {
                if (capacity <= 4) throw new Exception("---Van is full or try to put one more SMALL or MEDIUM bottle---");
            }
        }
        System.out.println("------LOADING PASSED SUCCESSFULLY------");
    }

    public int getCapacity() {
        return capacity;
    }
}
