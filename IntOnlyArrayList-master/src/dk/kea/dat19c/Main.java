package dk.kea.dat19c;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        IntOnlyArrayList intOnlyArrayList = new IntOnlyArrayList();
        //instantier
        IntOnlyArrayList il = new IntOnlyArrayList();



        int index = 2;
        //original array with 10 elements
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        //henter element på index 5
        System.out.println("Getting element from index ");
       intOnlyArrayList.getIndex(arr, 5);
        System.out.println("---------------");
       //printer size af array
        System.out.println("Array size is:");
       intOnlyArrayList.size(arr);
        System.out.println("--------------------");



        //printer orig array
        System.out.println("Orig array contains: " + Arrays.toString(arr));

        //element vi vil tilføje
        int x  = 50;

        //kalder metode der tilføjer x til nyt array
        arr = intOnlyArrayList.addX(n, arr, x);

        System.out.println("New array contains: " + Arrays.toString(arr));


        System.out.println("-------------");
        System.out.println("orig array: " + Arrays.toString(arr));
        arr = intOnlyArrayList.removeX(arr, index);
        System.out.println("new array: " + Arrays.toString(arr));


        System.out.println("-----------------");

    }




}
