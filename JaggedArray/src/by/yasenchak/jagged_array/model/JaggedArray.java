package by.yasenchak.jagged_array.model;

import by.yasenchak.jagged_array.abstract_class.AbstractSort;

import java.util.Arrays;

public class JaggedArray {
    private AbstractSort abstractSort;
    private int[][] jaggedArray;

    public JaggedArray(){}
    public JaggedArray(int[][] jaggedArray){
        this.jaggedArray = jaggedArray;
    }

    public int[][] getJaggedArray() {
        return jaggedArray;
    }

    public void setJaggedArray(int[][] jaggedArray) {
        this.jaggedArray = jaggedArray;
    }

    public void setIndexJaggedArray(int indexRow, int indexCol, int value){
        this.jaggedArray[indexRow][indexCol] = value;
    }

    public void setAbstractSort (AbstractSort abstractSort){
        this.abstractSort = abstractSort;
    }

    public void sort(){
        abstractSort.sort(jaggedArray);
    }

    public void reverseSort(){
        abstractSort.reversSort(jaggedArray);
    }

    @Override
    public String toString() {
        StringBuilder jagAr = new StringBuilder();
        for (int i = 0; i < jaggedArray.length; i++) {
            jagAr.append("\n");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jagAr.append(jaggedArray[i][j] + " ");
            }
        }
        return getClass().getName() + "@" +
                "jaggedArray= " + jagAr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JaggedArray that = (JaggedArray) o;
        return Arrays.equals(jaggedArray, that.jaggedArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(jaggedArray);
    }
}
