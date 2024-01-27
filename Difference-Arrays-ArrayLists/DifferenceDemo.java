import java.util.ArrayList;

public class DifferenceDemo {
    public static void main(String[] args) {
        // Array Example
        int[] numbersArray = new int[5]; // fixed size
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = i * 2;
        }

        // Printing array elements
        System.out.println("Array Elements:");
        for (int number : numbersArray) {
            System.out.println(number);
        }

        // ArrayList Example
        ArrayList<Integer> numbersList = new ArrayList<>(); // resizable
        for (int i = 0; i < 5; i++) {
            numbersList.add(i * 2);
        }

        // Adding an element to ArrayList
        numbersList.add(10); 

        // Removing an element from ArrayList
        numbersList.remove(new Integer(4)); 

        // Printing ArrayList elements
        System.out.println("\nArrayList Elements:");
        for (int number : numbersList) {
            System.out.println(number);
        }

        // Demonstrating differences
        // For array, you cannot add or remove elements dynamically
        // numbersArray[5] = 10; // This would throw an ArrayIndexOutOfBoundsException

        // Accessing elements
        System.out.println("\nAccessing elements:");
        System.out.println("Array 2nd element: " + numbersArray[1]);
        System.out.println("ArrayList 2nd element: " + numbersList.get(1));

        // Size comparison
        System.out.println("\nSize of array: " + numbersArray.length);
        System.out.println("Size of ArrayList: " + numbersList.size());
    }
}
