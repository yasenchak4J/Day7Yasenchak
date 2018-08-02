package by.yasenchak.jagged_array.service;

import by.yasenchak.jagged_array.abstract_class.AbstractSort;

public class SortedByMaxVal extends AbstractSort {

    @Override
    public void sort(int[][] jaggedArray) {
        int firstRowMax, secondRowMax;
        for (int bubIndex = 0; bubIndex < jaggedArray.length; bubIndex++) {
            for (int i = 0, i1 = i + 1; i < jaggedArray.length - 1; i++) {
                firstRowMax = jaggedArray[i][0];
                secondRowMax = jaggedArray[i1][0];
                for (int j = 0; j < jaggedArray[i].length - 1; j++) {
                    if(firstRowMax < jaggedArray[i][j]){
                        firstRowMax = jaggedArray[i][j];
                    }
                }
                for (int j2 = 0; j2 < jaggedArray[i1].length - 1; j2++) {
                    if(secondRowMax < jaggedArray[i1][j2]){
                        secondRowMax = jaggedArray[i1][j2];
                    }
                }
                if (firstRowMax >= secondRowMax) {
                    swap(jaggedArray,i,i + 1);
                }
            }
        }
    }
}
