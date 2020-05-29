import java.util.ArrayList;
import java.util.List;

class Try {
    public static String highAndLow(String numbers) {
        return "AH";
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
class Typetester {
    void printType(byte x) {
        System.out.println(x + " is an byte");
    }
    void printType(int x) {
        System.out.println(x + " is an int");
    }
    void printType(float x) {
        System.out.println(x + " is an float");
    }
    void printType(String x) {
        System.out.println(x + " is a String");
    }
    void printType(char x) {
        System.out.println(x + " is an char");
    }
}


//import java.util.ArrayList;
//import java.util.List;
//
//class Try {
//    public static String Tickets(int[] peopleInLine) {
//        int twenty_fives = 0;
//        List<Integer> not_twenty_fives = new ArrayList<>();
//        for (int element: peopleInLine) {
//            if (element == 25) twenty_fives++;
//            else not_twenty_fives.add(element);
//        }
//        for (int element: not_twenty_fives) {
//            for (int i = 1; i <= twenty_fives; i++) {
//                if (element - 25 * i == 25) break;
//            }
//        }
//        return "YES";
//    }
//    public static void main(String[] args) {
//        System.out.println(Tickets(new int []{25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 100, 100, 100, 100}));
//    }
//}

// 25, 25, 25, 25, 25, 25, 25, 25, 25, 25 YES ++
// 25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 100, 100, 100, 100 NO ++
// 25, 50, 25, 50, 100, 25, 25, 50 NO ++
// 25, 50, 100, 25, 25, 25, 50 NO ++
// 25, 25, 25, 25, 25, 100, 100 NO ++
// 25, 25, 50, 50, 100 expected:<[NO]> ++
// 25, 25, 25, 100 expected:<[YES]>
// 25, 25, 50, 100 expected:<[YES]>
// 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 expected:<[NO]>
// 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 expected:<[NO]>
// 25, 25, 25, 25, 50, 100, 50 expected:<[YES]>
// 50, 100, 100 expected:<[NO]>
