package by.yasenchak.array.main;

import by.yasenchak.array.domain.Array;
import by.yasenchak.array.service.ArrayMerge;
import by.yasenchak.array.service.ArraySearch;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {


        int[] mass = new int[]{178, 13, 178, 144,21};
        Array array = new Array(mass);
        int[] mass2 = new int[]{2, 4, 5};
        Array array2 = new Array(mass2);


//        Array array = CreateArray.createFromFile("resurse/1");
//        System.out.println(array.toString());

//        Array array = CreateArray.createRandomArr(10, -5,5);
//        System.out.println(array.toString());
//        Array array = new Array(1,2,3,4,5,6);
//        Array array = ScanFromConsole.getArrayFromConsole();
        array.bubleSort();
        System.out.println("Sorted mass: "+ "\n" + array.toString());

        ArraySearch arraySearch = new ArraySearch(array);

        int searchIndex = array.binarySearch(21);
        System.out.println("Element located at " + searchIndex + " index");
        int max = array.getMaxElement();
        System.out.println("Max element is " + max);
        int[] simpleNumber = arraySearch.getSimpleNumber();
        System.out.println("Simple number are: " + Arrays.toString(simpleNumber));
        int[] fibanacciArr = arraySearch.getFibonacciNumber();
        System.out.println("Fibanacci numbers are " + Arrays.toString(fibanacciArr));
        int[] threeDifDig = arraySearch.getThreeDigitsDif();
        System.out.println("Three-digit difference numbers " + Arrays.toString(threeDifDig));
        ArrayMerge arrayMerge = new ArrayMerge(array, array2);
        array = arrayMerge.merge();
        System.out.println(array.toString());

    }
}
