package by.yasenchak.array.service;

import by.yasenchak.array.domain.Array;

import java.util.ArrayList;
import java.util.List;

public class ArraySearch {
    private Array array;

    public ArraySearch(Array array){
        this.array = array;
    }

    public int[] getSimpleNumber(){
        int[] simpleArray = null;
        int[] lastArray = null;
        int elemCounter = 0;
            simpleArray = new int[array.getAllArray().length];
            for (int i = 0; i < simpleArray.length; i++) {
                if (array.getIndexArray(i) >= 1 && isSimple(array.getIndexArray(i))) {
                    simpleArray[i] = array.getIndexArray(i);
                }
            }
            for (int i = 0; i < simpleArray.length; i++) {
                if(simpleArray[i] != 0){
                    elemCounter++;
                }
            }
            if(elemCounter > 0) {
                lastArray = new int[elemCounter];

                for (int i = 0, j = 0; i < simpleArray.length; i++) {
                    if (simpleArray[i] != 0) {
                        lastArray[j] = simpleArray[i];
                        j++;
                    }
                }
            } else return lastArray;
            return lastArray;
    }

    private boolean isSimple(int value){
        boolean simple = true;
        for (int i = 2; i < value; i++) {
            if (value % i == 0){
                simple = false;
            }
        }
        return simple;
    }

    public int[] getFibonacciNumber(){
        int[] fibanacciArray = new int[array.getMaxElement()];
        int[] findFibArr = null;
        int elementCounter = 0;
        fibanacciArray[0] = 0; fibanacciArray[1] = 1; fibanacciArray[2] = 1;
        for (int i = 3; i < fibanacciArray.length; i++) {
            fibanacciArray[i] = fibanacciArray[i-2] + fibanacciArray[i-1];
        }
        for (int i = 0; i < array.getAllArray().length; i++) {
            for (int j = 0; j < fibanacciArray.length; j++) {
                if (array.getIndexArray(i) >= 0 && array.getIndexArray(i) == fibanacciArray[j]){
                    elementCounter++;
                }
            }
        }
        if (elementCounter > 0) {
            findFibArr = new int[elementCounter];
            for (int i = 0, k = 0; i < array.getAllArray().length; i++) {
                for (int j = 0; j < fibanacciArray.length; j++) {
                    if (array.getIndexArray(i) >= 0 && array.getIndexArray(i) == fibanacciArray[j]) {
                        findFibArr[k] = array.getIndexArray(i);
                        k++;
                    }
                }
            }
        } else return findFibArr;
        return findFibArr;
    }

    public int[] getThreeDigitsDif(){
        int[] threeDifDigWithZerro = new int[array.getAllArray().length];
        int elementCounter = 0;
        for (int i = 0; i < array.getAllArray().length; i++) {
            if ((array.getIndexArray(i) >= 100 && array.getIndexArray(i) <= 999) || (array.getIndexArray(i) <= -100 && array.getIndexArray(i) >= -999)){
                int value = array.getIndexArray(i);
                int firstNumber = value % 10;
                value /= 10;
                int secondNumber = value % 10;
                value /= 10;
                int threeNumber = value;
                if (firstNumber != secondNumber && secondNumber != threeNumber && threeNumber != firstNumber){
                    threeDifDigWithZerro[i] = array.getIndexArray(i);
                    elementCounter++;
                }
            }
        }
        int[] threeDigNumbers = new int[elementCounter];
        for (int i = 0, j = 0; i < threeDifDigWithZerro.length; i++) {
            if(threeDifDigWithZerro[i] != 0) {
                threeDigNumbers[j] = threeDifDigWithZerro[i];
                j++;
            }
        }
        return threeDigNumbers;
    }

}
