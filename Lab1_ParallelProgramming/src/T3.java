/** Parallel Programming.
 * Labwork 1. Threads in Java
 * Trybushenko Artem
 * IV-93
 * Variant #26
 * T3: 3.12 S = MAX(V * MO + P * (MT * MS) + R)
 */

// 3.12 S = MAX((V * MO) + (P * (MT * MS)) + R)

public class T3 extends Thread {

    private Data data;

    T3(String name, int priority, Data data) {
        setName(name);
        setPriority(priority);
        this.data = data;
    }

    @Override
    public void run() {
        try {
            System.out.println("Start task3");
            int n = data.returnN();
            int[] V = new int[n];
            int[] R = new int[n];
            int[] P = new int[n];
            int[][] MT = new int [n][n];
            int[][] MS = new int[n][n];
            int[][] MO = new int[n][n];


            int max = 10;
            for(int i = 0; i < n; i++){
                //V[i] = new Random().nextInt(max);
                //R[i] = new Random().nextInt(max);
                //P[i] = new Random().nextInt(max);
                V[i] = 1;
                R[i] = 1;
                P[i] = 1;
                for (int j = 0; j < n; j++){
                    //MT[i][j] = new Random().nextInt(max);
                    //MS[i][j] = new Random().nextInt(max);
                    //MO[i][j] = new Random().nextInt(max);
                    MT[i][j] = 1;
                    MS[i][j] = 1;
                    MO[i][i] = 1;
                }
            }
            int result = data.func3(V, P, R, MT, MS, MO);
            sleep(500);

            data.WriteLine(V, "V");
            data.WriteLine(P, "P");
            data.WriteLine(R, "R");
            data.WriteLine(MT, "MT");
            data.WriteLine(MS, "MS");
            data.WriteLine(MO, "MO");
            System.out.println("S = " + result);
            System.out.println("End Task3");
        } catch (InterruptedException e) { //виведення у випадку помилки
            e.printStackTrace();
        }
    }

}
