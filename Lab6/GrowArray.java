package Lab6;

public class GrowArray {
    public Bottle_of_coffee[] growArray(Bottle_of_coffee[] array_to_increase,Bottle_of_coffee element_to_add) {
        Bottle_of_coffee[] bottle_of_coffees1 = new Bottle_of_coffee[array_to_increase.length + 1];
        for (int i = 0; i < array_to_increase.length; i++) {
            bottle_of_coffees1[i] = array_to_increase[i];
        }
        bottle_of_coffees1[array_to_increase.length] = element_to_add;
        return bottle_of_coffees1;
        
    }
}
