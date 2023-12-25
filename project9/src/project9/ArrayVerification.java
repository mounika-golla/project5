package project9;

public class ArrayVerification {

    public static void main(String[] args) {
        
        int[] array = createAndInitializeArray(5);
        printArray("Initialized Array:", array);

        
        updateArray(array, 2, 10);
        printArray("Updated Array:", array);

      
        int element = accessArray(array, 3);
        System.out.println("Accessed Element at Index 3: " + element);

       
        traverseArray(array);

       
        int[] copy = copyArray(array);
        printArray("Copied Array:", copy);
    }

    // Function to create and initialize an array
    private static int[] createAndInitializeArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i * 2; 
        }
        return array;
    }

    // Function to update an element in the array
    private static void updateArray(int[] array, int index, int value) {
        array[index] = value;
    }

    // Function to access an element in the array
    private static int accessArray(int[] array, int index) {
        return array[index];
    }

    // Function to traverse and print elements of the array
    private static void traverseArray(int[] array) {
        System.out.print("Traversed Array: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Function to copy an array
    private static int[] copyArray(int[] array) {
        int[] copy = new int[array.length];
        System.arraycopy(array, 0, copy, 0, array.length);
        return copy;
    }

    // Function to print the elements of an array
    private static void printArray(String message, int[] array) {
        System.out.print(message + " ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
