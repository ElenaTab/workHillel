package hw.hw3;

public class Task1 {
    /*1. Program to print the duplicate elements of an array
In this program, we need to print the duplicate elements present in the array. This can be done through two loops. The first loop will select an element and the second loop will iteration through the array by comparing the selected element with other elements. If a match is found, print the duplicate element.

Program to print the duplicate elements of an array
In the above array, the first duplicate will be found at the index 4 which is the duplicate of the element (2) present at index 1. So, duplicate elements in the above array are 2, 3 and 8.

Algorithm
STEP 1: START
STEP 2: INITIALIZE arr[]= {1, 2, 3, 4, 2, 7, 8, 8, 3}.
STEP 3: PRINT "Duplicate elements in given array:"
STEP 4: REPEAT STEP 5 to STEP 7 for(i=0; i<arr.length; i++)
STEP 5: REPEAT STEP 6 and STEP 7 for(j=i+1; j<arr.length; j++)
STEP 6: if(arr[i] == arr[j])
STEP 7: PRINT arr[j]
STEP 8: END
    */
    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println("Duplicate elements in given array: ");

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
