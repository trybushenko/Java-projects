public class Lab1 extends Thread {

    public static void main(String[] args) {
        (new Lab1()).start();
    }

    @Override
    public void run() {

        System.out.println("Start lab1\n");


        System.out.println(" Parallel Programming.\n" +
                "* Labwork 1. Threads in Java\n" +
                "* Trybushenko Artem\n" +
                "* IV-93\n" +
                "* Variant #26\n" +
                "* F1: 1.05 C = SORT(A) * (MA*ME) + SORT(B)\n" +
                "* F2: 2.08 MF = MG * (MH * ML)\n" +
                "* F3: 3.12 S = MAX(V * MO + P * (MT * MS) + R)\n");

        setName("Lab1"); //встановлення імені потоку

        int n = 6; //розмірність матриці та вектрорів

        Data data = new Data(n); //створення екземпляру, передання значення n

        // встановлюємо пріорітети програми
        T1 t1 = new T1("T1", Thread.NORM_PRIORITY, data);
        T2 t2 = new T2("T2", Thread.MAX_PRIORITY, data);
        T3 t3 = new T3("T3", Thread.MIN_PRIORITY, data);

        // запуск за допомогою методу start();
        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join(); // фіксує трасування потоку
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace(); //виведення у випадку помилки
        }
        System.out.println("\nEnd lab1");
    }
}