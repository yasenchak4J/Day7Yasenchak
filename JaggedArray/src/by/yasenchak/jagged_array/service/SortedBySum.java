package by.yasenchak.jagged_array.service;

import by.yasenchak.jagged_array.abstract_class.AbstractSort;

public class SortedBySum extends AbstractSort {

    @Override
    public void sort(int[][] jaggedArray) {
        int firstRowSum, secondRowSum;
        for (int bubIndex = 0; bubIndex < jaggedArray.length; bubIndex++) {
            for (int i = 0, i1 = i + 1; i < jaggedArray.length - 1; i++) {
                firstRowSum = 0;
                secondRowSum = 0;
                for (int j = 0; j < jaggedArray[i].length - 1; j++) {
                    firstRowSum += jaggedArray[i][j];
                }
                for (int j2 = 0; j2 < jaggedArray[i1].length - 1; j2++) {
                    secondRowSum += jaggedArray[i1][j2];
                }
                if (firstRowSum >= secondRowSum) {
                    swap(jaggedArray,i,i + 1);
                }
            }
        }
    }
}
