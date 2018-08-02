package by.yasenchak.matrix.service;

import by.yasenchak.matrix.domain.Matrix;

import java.util.Arrays;

public class MatrixOperation {
    private Matrix matrix;

    public MatrixOperation(Matrix matrix) {
        this.matrix = matrix;
    }

    public void sortMatrixColValue(int colIndex) {
        if (colIndex >= 0) {
            for (int i = 0; i < matrix.getAllMatrix().length; i++)
                for (int k = i + 1; k < matrix.getAllMatrix()[i].length; k++) {
                if (k < matrix.getAllMatrix().length) {
                    if (matrix.getIndexMatrix(i, colIndex) > matrix.getIndexMatrix(k, colIndex)) {
                        for (int j = 0; j < matrix.getAllMatrix()[i].length; j++) {
                            double temp = matrix.getIndexMatrix(i, j);
                            matrix.setIndexMatrix(i, j, matrix.getIndexMatrix(k, j));
                            matrix.setIndexMatrix(k, j, temp);
                        }
                    }
                }  else return;
            }
        } else return;
    }

    public void sortMatrixRowValue(int rowIndex){
        if (rowIndex >= 0 && rowIndex <= matrix.getAllMatrix().length) {
            boolean check = false;
            do {
                check = false;
                for (int k = 0; k < matrix.getAllMatrix()[rowIndex].length - 1; k++) {
                    if (matrix.getIndexMatrix(rowIndex, k) > matrix.getIndexMatrix(rowIndex, k + 1)) {
                        double temp = matrix.getIndexMatrix(rowIndex, k);
                        matrix.setIndexMatrix(rowIndex, k, matrix.getIndexMatrix(rowIndex, k + 1));
                        matrix.setIndexMatrix(rowIndex, k + 1, temp);
                        check = true;
                    }
                }
            } while (check);
            } else return;
    }

    public double[] findMaxInRow() {
        double[] maxInRow = new double[matrix.getAllMatrix().length];
        for (int i = 0; i < matrix.getAllMatrix().length; i++) {
            double max = matrix.getIndexMatrix(i, 0);
            for (int j = 0; j < matrix.getAllMatrix()[i].length; j++) {
                if (max < matrix.getIndexMatrix(i, j)) {
                    max = matrix.getIndexMatrix(i, j);
                }
            }
            maxInRow[i] = max;
        }
        return maxInRow;
    }

    public double[] findMinInCol(){
        double[] minInCol = new double[matrix.getAllMatrix()[0].length];
        for (int i = 0; i < matrix.getAllMatrix()[0].length ; i++) {
            double min = matrix.getIndexMatrix(0, i);
            for (int j = 0; j < matrix.getAllMatrix().length; j++) {
                    if (min > matrix.getIndexMatrix(j, i)){
                        min = matrix.getIndexMatrix(j, i);
                    }

            }
            minInCol[i] = min;
        }
        return minInCol;
    }

    public void zeroToRight() {
        for (int i = 0; i < matrix.getAllMatrix().length; i++) {
            int lastNonZeroIndex = 0;
            for (int j = 0; j < matrix.getAllMatrix()[i].length; j++) {
                if (matrix.getIndexMatrix(i,j) != 0){
                    matrix.setIndexMatrix(i, lastNonZeroIndex++, matrix.getIndexMatrix(i, j));
                }
            }
            for (int j = lastNonZeroIndex; j < matrix.getAllMatrix()[i].length; j++) {
                matrix.setIndexMatrix(i, j, 0.0);
            }
        }
    }

    public void tranMatrix(){
         if (matrix.getAllMatrix().length == matrix.getAllMatrix()[0].length) {
            for (int i = 0; i < matrix.getAllMatrix().length; i++) {
                for (int j = i + 1; j < matrix.getAllMatrix()[i].length; j++) {
                    double temp = matrix.getIndexMatrix(i, j);
                    matrix.setIndexMatrix(i, j, matrix.getIndexMatrix(j, i));
                    matrix.setIndexMatrix(j, i, temp);
                }
            }
        } else return;

    }

    public double[] getSumBtw(){
        double[] sumBtw = new double[matrix.getAllMatrix().length];
        for (int i = 0; i < matrix.getAllMatrix().length; i++) {
            double sum = 0;
            int indexStart = 0, indexStop = 0;
            for (int j = 0; j < matrix.getAllMatrix()[i].length; j++) {
               if (matrix.getIndexMatrix(i,j) > 0){
                   indexStart = j; break;
               }
            }
            for (int j = indexStart + 1; j < matrix.getAllMatrix()[i].length ; j++) {
                if (matrix.getIndexMatrix(i,j) > 0){
                    indexStop = j; break;
                }
            }
            for (int j = indexStart + 1; j < indexStop; j++) {
                sum += matrix.getIndexMatrix(i,j);

            }
        sumBtw[i] = sum;
        }
        return sumBtw;
    }
}