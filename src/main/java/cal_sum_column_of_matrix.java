import java.util.Scanner;

public class cal_sum_column_of_matrix {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float[][] matrix2D;
        System.out.println("Input matrix row:");
        int rowMatrix = scanner.nextInt();
        System.out.println("Input matrix column: ");
        int columnMatrix = scanner.nextInt();
        matrix2D = new float[rowMatrix][columnMatrix];
        inputRandomTo2DMatrix(matrix2D);
        showMatrix2D(matrix2D);
        System.out.println("Input column:");
        int column = scanner.nextInt();
        float sum = calSumOfColumnInMatrix(matrix2D, column);
        System.out.println(sum);


    }

    public static void inputElementTo2DMatrix(float[][] matrix2D) {
        for (int i = 0; i < matrix2D.length; i++) {
            for (int j = 0; j < matrix2D[i].length; j++) {
                System.out.println("Input element [" + i + "][" + j + "] :");
                matrix2D[i][j] = scanner.nextFloat();
            }
        }
    }

    public static float calSumOfColumnInMatrix(float[][] matrix, int column) {
        float sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == column) sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static void showMatrix2D(float[][] matrix2D) {
        for (int i = 0; i < matrix2D.length; i++) {
            for (int j = 0; j < matrix2D[i].length; j++) {
                System.out.print(matrix2D[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void inputRandomTo2DMatrix(float[][] matrix2D){
        for(int i=0;i<matrix2D.length;i++){
            for(int j=0;j<matrix2D[i].length;j++){
                matrix2D[i][j]= (float)Math.random()*100;
            }
        }
    }
}
