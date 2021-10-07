/** Parallel Programming.
 * Labwork 1. Threads in Java
 * Trybushenko Artem
 * IV-93
 * Variant #26
 * T2: 1.05 C = SORT(A) * (MA*ME) + SORT(B)
 */

public class T1 extends Thread {
    private final Data data;

    T1(String name, int priority, Data data) {
        setName(name);
        setPriority(priority);
        this.data = data;
    }

    @Override
    public void run() {
        try {
            System.out.println("Start task1");

            int n = data.returnN(); //отримуємо значення n

            int[] A = new int[n]; //задаємо значення векторів
            int[] B = new int[n];
            int[][] MA = new int [n][n]; //задаємо значення матриці
            int[][] ME = new int[n][n];

            int max = 100;
            for(int i = 0; i < n; i++) {
                // A[i] = new Random().nextInt(max); //рандомне заповнення
                // B[i] = new Random().nextInt(max);

                A[i] = 1;
                B[i] = 1;

                for (int j = 0; j < n; j++){
                    // MA[i][j] = new Random().nextInt(max);
                    // ME[i][j] = new Random().nextInt(max);
                    MA[i][j] = 1;
                    ME[i][j] = 1;
                }
            }


            int[] res = data.func1(A, B, MA, ME);
            sleep(400);
            data.WriteLine(A, "A");
            data.WriteLine(B, "B");
            data.WriteLine(MA, "MA");
            data.WriteLine(ME, "ME");

            System.out.print("res = ");
            for (int elem : res) {
                System.out.print(elem + " ");
            }
            System.out.println();


            System.out.println("End task1");
        } catch (InterruptedException e) { //виведення у випадку помилки
            e.printStackTrace();
        }
    }

}
