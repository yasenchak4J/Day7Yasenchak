package by.yasenchak.jagged_array.presentation;

import by.yasenchak.jagged_array.model.JaggedArray;

import java.util.Scanner;

public class ScanFromConsole {

    private ScanFromConsole(){}

    public static JaggedArray fillFromConsole(){
        int arrayCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array count: ");
        arrayCount = scanner.nextInt();

        int[][] jaggedMass = new int[arrayCount][];
        for (int i = 0; i < jaggedMass.length; i++) {
            int arraySize = 0;
            System.out.println("Input array[" + i + "]  size");
            arraySize = scanner.nextInt();
            jaggedMass[i] = new int[arraySize];
            for (int j = 0; j < jaggedMass[i].length; j++) {
                System.out.println("Input element[" + j +"] of array");
                jaggedMass[i][j] = scanner.nextInt();
            }
        }
        JaggedArray jaggedArray = new JaggedArray(jaggedMass);
        return jaggedArray;
    }
}
