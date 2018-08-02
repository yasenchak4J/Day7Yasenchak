package by.yasenchak.array.domain;

import java.util.Arrays;

public class Array {
    private int[] array;

    public Array (int... arr){
        this.array = arr;
    }

    public Array (int elementCount){
        array = new int[elementCount];
    }

    public int getIndexArray(int index) {
        if (index >= 0) {
            return array[index];
        } return -1;
    }

    public void setIndexArray(int index, int value) {
        if (index >= 0) {
            array[index] = value;
        } return;
    }

    public int[] getAllArray(){
        return array;
    }

    public int binarySearch(int searchValue){
        int low = 0;
        int high = array.length;
        int indexAtPosition = -1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (array[mid] == searchValue){
                indexAtPosition = mid;
            }
            if (array[mid] > searchValue){
                high = mid - 1;
            } else low = mid + 1;
        }
        return indexAtPosition;
    }

    public int getMaxElement(){
        int maxElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxElement < array[i]){
                maxElement = array[i];
            }
        }
        return maxElement;
    }
    public int getMinElement(){
        int minElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minElement > array[i]) {
                minElement = array[i];
            }
        }
        return minElement;
    }

    private void swapElements(int[] arr, int firstIndex, int lastIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }

    public void bubleSort(){
        boolean change;
        do {
            change = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]){
                    swapElements(array, i, i + 1);
                    change = true;
                }
            }

        } while (change);
    }

    public void simpleSelectionSort(){
        int indexMin;
        for(int index = 0; index < array.length - 1; index++){
            indexMin = index;
            for (int indexToScan = index; indexToScan < array.length; indexToScan++) {
                if (array[indexMin] > array[indexToScan]){
                    indexMin = indexToScan;
                }
            }
            swapElements(array, index, indexMin);

        }
    }

    public void quickSort(int low, int high){
        double sr = array[(low + high) / 2];
        int i, j;
        i = low;
        j = high;

        do {
            while(array[i] < sr){
                i++;
            }
            while(array[j] > sr){
                j--;
            }
            if (i <= j){
                swapElements(array, i, j);
                i++;
                j--;
            }
        } while (i <= j);
        if (i < high){
            quickSort(i, high);
        }
        if (j > low){
            quickSort(low, j);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array objArray = (Array) o;
        return Arrays.equals(array, objArray.array);
//        or
//        if (array.length != objArray.array.length) {
//            return false;
//        } else {
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] != objArray.array[i]){
//                    return false;
//                }
//            }
//        }
//        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            result = array[i] + 31 + Arrays.hashCode(array);
        }
        return result;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + Arrays.toString(array);
    }
}
