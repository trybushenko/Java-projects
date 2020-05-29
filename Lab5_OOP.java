public class Lab5_OOP {
    public static void main(String[] args) {
        System.out.println("*******");
        System.out.println("     **");
        System.out.println("     **");
        System.out.println("     **");
        System.out.println("**   **");
        System.out.println("**   **");
        System.out.println(" ******");
    }
}
class TypeTester {
    void printType(Byte x) {
        System.out.println(x + " is a byte");
    }
    void printType(Boolean x) {
        System.out.println(x + " is a boolean");
    }
    void printType(Integer x) {
        System.out.println(x + " is an int");
    }
    void printType(Float x) {
        System.out.println(x + " is a float");
    }
    void printType(Double x) {
        System.out.println(x + " is a double");
    }
    void printType(Long x) {
        System.out.println(x + " is a Long");
    }
    void printType(String x) {
        System.out.println(x + " is a String");
    }
    void printType(Object x) {
        if( x instanceof Byte ) {
            this.printType((Byte)x);
        }
        else if( x instanceof Boolean ) {
            this.printType((Boolean)x);
        }
        else if( x instanceof Integer ) {
            this.printType((Integer)x);
        }
        else if( x instanceof Float ) {
            this.printType((Float)x);
        }
        else if( x instanceof Double ) {
            this.printType((Double)x);
        }
        else if( x instanceof Character ) {
            this.printType((Character)x);
        }
        else if( x instanceof String ) {
            this.printType((String)x);
        }
        else {
            System.out.println(x + " is of unknown type");
        }
    }
}

