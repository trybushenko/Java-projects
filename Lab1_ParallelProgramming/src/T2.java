/** Parallel Programming.
 * Labwork 1. Threads in Java
 * Trybushenko Artem
 * IV-93
 * Variant #26
 * T2: 2.08 MF = MG * (MH * ML)
 */

public class T2 extends Thread {

    private Data data;

    T2(String name, int priority, Data data) {
        setName(name);
        setPriority(priority);
        this.data = data;
    }

    @Override
    public void run() {
        try {
            System.out.println("Start task2");
            int n = data.returnN();

            int[][] ML = new int [n][n];
            int[][] MG = new int[n][n];
            int[][] MH = new int[n][n];

            int max = 100;
            for(int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    // MK[i][j] = new Random().nextInt(max);
                    // MG[i][j] = new Random().nextInt(max);
                    // MH[i][j] = new Random().nextInt(max);

                    ML[i][j] = 1;
                    MG[i][j] = 1;
                    MH[i][j] = 1;
                }
            }
            int[][] result = data.func2(ML, MG, MH);
            data.WriteLine(ML, "ML");
            data.WriteLine(MG, "MG");
            data.WriteLine(MH, "MH");
            data.WriteLine(result, "MF");
            sleep(200);
            System.out.println("End task2");
        } catch (InterruptedException e) { //виведення у випадку помилки
            e.printStackTrace();
        }
    }
}
