package Homework2;

public class Spiral {
    public static void main(String[] args) {
        int N = 5;//размер массива
        int r = 0;//строка
        int c = 0;//столбец
        int[][] array = new int[N][N];
        int[] array2 = new int[N * N];
        int I = 0;
        int k = 1;
        int spec = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = k;
                k++;
            }
        }
        //вывод исходного массива
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }

        for (int z = 0; I < N * N ; z++) {
            for (int j = 0; j < N - spec; j++) {
                array2[I++] = array[r][c++];
            }
            c--;
            ++spec;

            for (int y = 0; y < N - spec; y++) {
                array2[I++] = array[++r][c];
            }

            for (int x = 0; x < N - spec; x++) {
                array2[I++] = array[r][--c];
            }
            ++spec;

            for (int q = 0; q < N - spec; q++) {
                array2[I++] = array[--r][c];
            }
            c++;
        }
        //вывод спирали
        System.out.println("Spiral: ");
            for (int j = 0; j < N*N; j++) {
                System.out.print(array2[j] + "\t");
            }

    }
}
