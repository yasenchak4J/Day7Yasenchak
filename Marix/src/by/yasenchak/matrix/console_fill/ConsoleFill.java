package by.yasenchak.matrix.console_fill;

import by.yasenchak.matrix.domain.Matrix;

import java.util.Scanner;

public class ConsoleFill {

    private static final String ARRAY_SIZE = "Enter array size: ";
    private static final String ERROR_ARRAY_SIZE = "Error input, try again!";

    private ConsoleFill(){}

    public static Matrix getMatrixFromConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(ARRAY_SIZE);
        if (!scanner.hasNextInt()){
            System.out.println(ERROR_ARRAY_SIZE);
            getMatrixFromConsole();
        }
        int rowCount = scanner.nextInt();
        int columnCount = scanner.nextInt();
        double[][] arrayFromConsole = new double[rowCount][columnCount];
        for (int i = 0; i < arrayFromConsole.length; i++) {
            for (int j = 0; j < arrayFromConsole[i].length ; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]= ");
                arrayFromConsole[i][j] = scanner.nextDouble();
            }
        }
        Matrix matrix = new Matrix(arrayFromConsole);
        return matrix;
    }

}
