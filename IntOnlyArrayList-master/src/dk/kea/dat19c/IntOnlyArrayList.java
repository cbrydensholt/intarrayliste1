package dk.kea.dat19c;

import java.util.Arrays;

public class IntOnlyArrayList {
    //ArrayList erstattes med et int-array
    public int size = 0;
    //tilføje field til at holde styr på størrelsen, eg. int str;

    public IntOnlyArrayList() {
        int[] ia = new int[5];
        //str = 0;
    }

    public int[] addX(int n, int arr[], int x){
        //skal erstattes med kode, der tilgår array
        // n = size og original array
        //add n elements (old elements) of the oiginal array
        //add new element in the n+1 position

        int i;

        //create new array of new size
        int newarr[] = new int[n+1]; //new array with an extra space

        //insert elements from old array into the new one
        //insert all elements until n (until no more old elements)
        for (i=0; i < n; i++) //for each element in old array, i increments until it reaches n (10 in our case), we put +1 so there is an extra space now available.
            newarr[i] = arr[i]; //new array is given I element spaces
        newarr[n] = x; //indsætter x, vores nye element, i n+1 pladsen, altså den nye plads.

        return newarr;

    }




    public int[] removeX(int[] arr, int index){

        //create new array
        //remove  1 space
        //copy old array into new one
        //except chosen index
        int[] newArray = new int[arr.length-1]; //create new array of 1 space less

        //copy all elements except the index to be removed
        for(int i = 0, k = 0; i < arr.length; i++){

            if(i == index){
                continue;
            }

            newArray[k++] = arr[i];

        }
    return newArray;



    }

    public void getIndex(int[] arr, int index){

        try {
            System.out.println(arr[index]);

        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public int size(int[] arr){

        int size = arr.length;
        System.out.println(size);
        return size;

    }


    /*


    public int get(int i){
        //skal erstattes med kode, der tilgår array
        return ia.get(i);
    }

    public void remove(int[] array origArray, int index){
        //skal erstattes med kode, der tilgår array

    }

    public int size(){
        //skal erstattes med kode, der bruger str
        return ia.size();
    }

    //her kan toString skrives


    @Override
    public String toString() {
        return "IntOnlyArrayList{" +
                "ia=" + ia +
                '}';
    } */
}
