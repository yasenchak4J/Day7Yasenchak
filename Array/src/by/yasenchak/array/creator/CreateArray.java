package by.yasenchak.array.creator;

import by.yasenchak.array.domain.Array;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CreateArray {

    private CreateArray(){}

    public static Array createRandomArr(int elementCount, int firstRangeRand, int lastRangeRand) {
        int range = (lastRangeRand - firstRangeRand) + 1;
        Array array = new Array(elementCount);
        for (int i = 0; i < elementCount; i++) {
            array.setIndexArray(i, (int) (Math.random() * range) - lastRangeRand);
        }
        return array;
    }

    public static Array createFromFile(String pathToFile) {
        File file = new File(pathToFile);
        int[] arrayFromFile = null;
        int elemCounter = 0;
        try{
            Scanner scanner = new Scanner(file);
            elemCounter = scanner.nextInt(); //first number in file is size of array
            arrayFromFile = new int[elemCounter];
            for (int i = 0; i < arrayFromFile.length; i++) {
                arrayFromFile[i] = scanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Array array = new Array(arrayFromFile);
        return array;
    }
}
