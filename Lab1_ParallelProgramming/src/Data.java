import java.util.Arrays;

/** Parallel Programming.
 * Labwork 1. Threads in Java
 * Dromashko Artem
 * IV-93
 * Variant #6
 * T1: 1.30 e = ( A*(MA*ME) *SORT(B) )
 * T2: 2.11 MF = MAX(MG)*(MH*MK)
 * T3: 3.22 S = SORT(O*(MS*MT)) - P
 */

public class Data {
    private int n;
    public Data(int n) {
        //встановлення значення n
        this.n = n;
    }

    public int returnN() {
        //повернення значення n
        return n;
    }

    /**
     * Знаходить значення першої функції
     * C = SORT(A) * (MA * ME) + SORT(B)
     * @param A, B вектори
     * @param MA, ME матриці
     * @return e скаляр
     */
    public int[] func1(int[] A, int[] B, int[][] MA, int[][] ME) {
        //
        int[] C = new int[n];
        int[][] mult_matr;
        int[] b_sort;
        int[] a_sort;
        int[] vec_mul_mat;

        mult_matr = Multiply(MA, ME);
        a_sort = SortVector(A);
        b_sort = SortVector(B);
        vec_mul_mat = VecMulMatrix(a_sort, mult_matr);
        assert vec_mul_mat != null;
        for (int i = 0; i < n; i++) {
            C[i] = vec_mul_mat[i] + b_sort[i];
        }
        return C;
    }

    /**
     * Знаходить значення другої функції
     * MF = MF = MG * (MH * ML)
     * @param MG, ML, MH матриці
     * @return MF матриця
     */
    public int[][] func2(int[][] ML, int[][] MG, int[][] MH) {
        int[][] MF;
        int[][] mult_matr;

        mult_matr = Multiply(MH, ML);
        MF = Multiply(MG, mult_matr);

        return MF;
    }

    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i = 1; i < inputArray.length; i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    /**
     * Знаходить максимальне значення з вектора з третьої функції
     * S = MAX(V * MO + P * (MT * MS) + R)
     * @param V, P, R вектори
     * @param MT, MS, MO матриці
     * @return S вектор
     */
    public int func3(int[] V, int[] P, int[] R, int[][] MT, int[][] MS, int[][] MO) {
        int[][] multiplication;
        int[] vec_matrix;
        int[] result_vector = new int[n];
        int[] mult_v_matr;

        mult_v_matr = VecMulMatrix(V, MO);
        multiplication = Multiply(MT, MS);
        vec_matrix = VecMulMatrix(P, multiplication);
        for (int i = 0; i < V.length; i++) {
            assert mult_v_matr != null;
            assert vec_matrix != null;
            result_vector[i] = mult_v_matr[i] + vec_matrix[i] + R[i];
        }
        int S = getMax(result_vector);
        return S;
    }

    /**
     * Віднімає вектори
     * @param A перший вектор
     * @param B другий вектор
     * @return різниця векторів
     */
    private int[] Subtr_vect(int[] A, int[] B) {
        if (A.length != B.length) {
            return null;
        }
        int [] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = A[i] - B[i];
        }
        return res;
    }

    /**
     * Множення векторів
     * @param A перший вектор
     * @param B другий вектор
     * @return добуток векторів
     */
    private int VecMul(int[] A, int[] B) {
        if (B.length != A.length) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += A[i] * B[i];
        }
        return res;
    }
    /**
     * Множить вектор на матрицю
     * @param A вектор
     * @param MA матриця
     * @return вектор
     */
    private int[] VecMulMatrix(int[] A, int[][] MA) {
        if (A.length != MA.length) {
            return null;
        }
        int[] res_vect = new int[n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                res_vect[i] += A[j] * MA[j][i];
            }
        }
        return res_vect;
    }

    /**
     * Знаходить максимальний елемент в матриці
     * @param matrA матриця для пошуку
     * @return максимальний елемент матриці
     */
    private int findMaxMatr(int[][] matrA){
        int max = matrA[0][0];
        for (int i = 0; i < matrA.length; i++) {
            for (int j = 0; j < matrA.length; j++) {
                if(max < matrA[i][j]){
                    max = matrA[i][j];
                }
            }
        }
        return max;
    }

    /**
     * Множить матрицю на число
     * @param a число
     * @param matrB матриця
     * @return результат множення
     */
    private int[][] multNumbMatr(int a, int matrB[][]){
        for (int i = 0; i < matrB.length; i++) {
            for (int j = 0; j < matrB[0].length; j++) {
                matrB[i][j] = matrB[i][j]*a;
            }
        }
        return matrB;
    }

    /**
     * Відображає вектор
     * @param A вектор для відображення
     */
    public void WriteLine(int[] A, String name){
        System.out.print(name + ": (");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println(")");

    }

    /**
     * Відображає матрицю
     * @param A матриця для відображення
     */
    public void WriteLine(int[][] A, String name){
        System.out.println(name + ": ");
        for(int i = 0; i < A.length; i++){
            System.out.print("(");
            for(int j = 0; j < A.length; j++) {
                System.out.print(A[i][j] + "   ");
            }
            System.out.println(")");
        }
    }

    /**
     * Сортує вектор за зростанням
     * @param A вектор для сортування
     * @return відсортований вектор
     */
    private int[] SortVector(int[] A) {
        //сортування вектора
        int[] c = Arrays.copyOf(A, n);
        Arrays.sort(c);
        int[] res = new int[c.length];
        for (int i = c.length; i > 0; i--){
            res[i-1] = c[c.length - i];
        }
        return res;
    }

    /**
     * Перемножає дві матриці
     * @param MA матриця
     * @param MB матриця
     * @return повертає добуток двох матриць
     */
    private int[][] Multiply(int[][] MA, int[][] MB) {
        int[][] res = new int[n][n];
        for (int i = 0; i < n ; i++){
            for (int j = 0; j < n ; j++){
                for (int k = 0; k < n ; k++){
                    res[i][j] += MA[i][k] * MB[k][j];
                }
            }
        }
        return res;
    }

}
