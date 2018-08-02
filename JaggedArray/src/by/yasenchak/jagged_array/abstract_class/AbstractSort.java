package by.yasenchak.jagged_array.abstract_class;

public abstract class AbstractSort {
    public void sort(int[][] jaggedArray){}

    public void reversSort(int[][] jaggedArray){
        int[][] reverseArray = new int[jaggedArray.length][];
        for (int i = jaggedArray.length - 1, revI = 0; i >= 0 ; i--) {
            reverseArray[revI] = jaggedArray[i];
            revI++;
        }
        for (int i = 0; i < jaggedArray.length; i++) {
            jaggedArray[i] = reverseArray[i];
        }
    }

    protected void swap(int[][] jaggedArray, int firstIndex, int secondIndex){
        int temp[] = jaggedArray[firstIndex];
        jaggedArray[firstIndex] = jaggedArray[secondIndex];
        jaggedArray[secondIndex] = temp;

    }

}

