package by.yasenchak.jagged_array.main;

import by.yasenchak.jagged_array.model.JaggedArray;
import by.yasenchak.jagged_array.presentation.ScanFromConsole;
import by.yasenchak.jagged_array.service.SortedByMinVal;
import by.yasenchak.jagged_array.service.SortedBySum;

public class Main {

    public static void main(String[] args) {

        int[][] jagged = new int[4][];
        jagged[0] = new int[]{100, 20};
        jagged[1] = new int[]{8 ,9};
        jagged[2] = new int[]{1,2,3};
        jagged[3] = new int[]{1};
        JaggedArray jaggedArray = new JaggedArray(jagged);
//        JaggedArray jaggedArray = ScanFromConsole.fillFromConsole();
        System.out.println("Initial jagged array: " + jaggedArray);
        jaggedArray.setAbstractSort(new SortedBySum()); // type of sort
        jaggedArray.sort();
        System.out.println("Sort: " + jaggedArray);
        jaggedArray.reverseSort();
        System.out.println("Revers sort: " + jaggedArray);
    }
}
