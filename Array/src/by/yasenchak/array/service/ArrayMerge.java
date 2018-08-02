package by.yasenchak.array.service;

import by.yasenchak.array.domain.Array;

import java.util.Arrays;

public class ArrayMerge {
    private Array firstArray, secondArray;

    public ArrayMerge(Array firstArray, Array secondArray) {
        this.firstArray = firstArray;
        this.secondArray = secondArray;
    }

    public Array merge(){
        int[] mergedArr = merging(firstArray.getAllArray(), secondArray.getAllArray());
        Array array = new Array(mergedArr);
        return array;
    }

    public int[] merge(int[] first, int[] second){
        int[] mergedArr = merging(first, second);
        return mergedArr;
    }

    private int[] merging(int[] first, int[] second){
        int[] mergeArray = new int[first.length + second.length];
        int i = 0, k = 0, j = 0;
        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                mergeArray[k] = first[i];
                i++;
            }
            else {
                mergeArray[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            mergeArray[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mergeArray[k] = second[j];
            j++;
            k++;
        }

        return mergeArray;
    }
}
