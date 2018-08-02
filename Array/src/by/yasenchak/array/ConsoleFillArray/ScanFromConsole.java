package by.yasenchak.array.ConsoleFillArray;

import by.yasenchak.array.domain.Array;

import java.util.Scanner;

public class ScanFromConsole {

    private static final String ARRAY_SIZE = "Enter array size: ";
    private static final String ERROR_INPUT_SIZE = "Error input, try again!";

    private ScanFromConsole(){}



    public static Array getArrayFromConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(ARRAY_SIZE);
        if (!scanner.hasNextInt()){
            System.out.println(ERROR_INPUT_SIZE);
            getArrayFromConsole();
        }
        int size = scanner.nextInt();
        int[] arrayFromConsole = new int[size];
        for (int i = 0; i < arrayFromConsole.length; i++) {
            System.out.print("[" + i + "]= ");
            arrayFromConsole[i] = scanner.nextInt();
        }
        Array array = new Array(arrayFromConsole);
        return array;
    }
}
