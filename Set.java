public class set {
    private int[] array;
    private int index;
    private static final int DEFAULT_CAPACITY = 32;

    public set() {
        array = new int[DEFAULT_CAPACITY];
    }
    public set(int capacity) {
        array = new int[capacity];
    }
    private void growArray() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }
    public void print() {
        for (int i:array) {
            System.out.print(i + " ");
        }
    }
    public void push(int value) {
        if (index == array.length) growArray();
        for (int elem:array) {
            if(elem == value) return;
        }
        array[index] = value;
        index++;
    }
    public int[] concatenate(int[] array_to_concatenate) {
        int[] newArray = new int[array_to_concatenate.length + array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        for (int i = 0; i <  array_to_concatenate.length; i++) {
            for (int value : array) {
                if (array_to_concatenate[i] == value) {
                    array_to_concatenate[i] = 0;
                    break;
                }
            }
        }
        for (int element:array_to_concatenate) {
            int counter = 0;
            for (int i = 0; i < array_to_concatenate.length; i++) {
                if (array_to_concatenate[i] == element) {
                    counter++;
                    if (counter > 1) {
                        array_to_concatenate[i] = 0;
                    }
                }
            }
        }
        System.arraycopy(array_to_concatenate, 0, newArray, array.length, array_to_concatenate.length);
        return newArray;
    }
    public int[] intersect(int[] array_to_intersect) {
        int[] newArray = new int[array_to_intersect.length + array.length];
        for (int element: array_to_intersect) {
            int counter = 0;
            for (int i = 0; i < array_to_intersect.length; i++) {
                if (array_to_intersect[i] == element) {
                    counter++;
                    if (counter > 1) {
                        array_to_intersect[i] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int element: array_to_intersect) {
                int temp = array[i];
                if (element == temp) {
                    newArray[i] = temp;
                    break;
                }
            }
        }
        return newArray;
    }
    public static void main(String[] args) {
        set mno = new set(5);
        mno.push(4);
        mno.push(3);
        mno.push(10);
        mno.push(14);
        mno.push(11);
        int[] mnozh = mno.intersect(new int[]{1,1,1,1,1,2,2,2,2,2,3,3,3,3,4,4,4,5,6,7,8,9,1,2,3,4,10,10,10,10,10,10});
        for (int element: mnozh) {
            System.out.print(element + " ");
        }
        System.out.println();
        mno.print();
        System.out.println();
        int[] mnozhestvo = mno.concatenate(new int[]{1,2,4,4,5,6,7,8,9,7,5,4,3,2,2,3,4,5,6,7});
        for (int element:mnozhestvo) {
            System.out.print(element + " ");
        }
    }
}

