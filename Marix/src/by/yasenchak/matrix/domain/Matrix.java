package by.yasenchak.matrix.domain;

import java.util.Arrays;

public class Matrix {
    private final static String SPACE = " ";

    private double[][] arr;

    public Matrix(double[][] arr){
        this.arr = arr;
    }

    public Matrix(int i, int j){
        arr = new double[i][j];
    }

    public double getIndexMatrix(int i, int j){
        if (i >= 0 && j >= 0) {
            return arr[i][j];
        } else return -1.0;
    }

    public void setIndexMatrix(int i, int j, double value){
        if (i >= 0 && j >= 0) {
            arr[i][j] = value;
        }else return;
    }

    public double[][] getAllMatrix(){
        return arr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return Arrays.equals(arr, matrix.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }

    @Override
    public String toString() {
        StringBuilder matrix = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            matrix.append("\n");
            for (int j = 0; j < arr[i].length; j++) {
                matrix.append(arr[i][j] + SPACE);
            }
        }
        return getClass().getName() + "@" + matrix;
    }
}
