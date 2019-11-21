import java.util.Arrays;

public class CommonArrayAlgorithms
{
    /*
     * Create array of the specified size filled with
     *      random values based on the maximum value.
     */
    public static int[] createRandomArray( int length, int maxValue )
    {
        int[] randomArray = new int[ length ];
        for( int i = 0; i < randomArray.length; i++ )
        {
            randomArray[ i ] = (int)( Math.random() * maxValue );
        }

        return randomArray;
    }

    /*
     * Prints the specified array to System.out
     */
    public static void printArray( int[] array )
    {
        System.out.println( Arrays.toString( array ));
    }

    /*
     * Array Algorithm #1: Sum and Average
     *  creates an array filled with random numbers
     *  calculates the sum and average of the numbers
     *  prints the array and the sum and average
     *  @returns the average
     */
    public static void sumAndAverage()
    {
        double sum = 0;
        double average = 0;

        int[] array = createRandomArray( 10, 50 );

        for( int element : array)
        {
            sum += element;
        }

        average = sum / array.length;

        printArray( array );
        System.out.println( "sum: " + sum + " average: " + average );
    }

    /*
     * Array Algorithm #2: Print Element Separators
     *  creates an array filled with random numbers
     *  prints each element of the array with a '|' between each element
     *      but not at the beginning or end of the array
     */
    public static void printElementSeparators()
    {
        int[] array = createRandomArray( 10, 50 );
        printArray( array );
        System.out.print(array[0]);
        for( int i = 1; i < array.length; i++)
        {
            System.out.print(" | ");
            System.out.print(array[i]);
        }
    }


    /*
     * Array Algorithm #3: Linear Search
     *  creates an array filled with random numbers
     *  find the index of the first element with the specified value
     *  prints the array and the index (or -1 if not found)
     */
    public static void linearSearch( int valueToFind )
    {
        int[] array = createRandomArray( 10, 50 );
        for (int i : array)
        {
            System.out.print(i + " ");
        }
        boolean why = false;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == valueToFind)
            {
                System.out.println("index: " + i);
                why = true;
            }
        }
        if (why != true)
        {
            System.out.println("Not found...");
        }

    }

    /*
     * Array Algorithm #4: Count Less Than
     *  creates an array filled with random numbers
     *  counts the number of elements that are less than the specified value
     *  prints the array and the count
     */
    public static void countLessThan( int limit )
    {
        int [] array = createRandomArray(10,50);
        int count = 0;
        for (int number: array) {
            if (number < limit)
            {count++;}
        }
        printArray(array);
        System.out.println(count);
    }

    /*
     * Array Algorithm #5.1: findMax
     *  creates an array filled with random numbers
     *  prints the array and the greatest number
     */
    public static void findMax() 
    {
        int [] newArray = createRandomArray(10, 10);
        int max = newArray[0];
        for(int i = 0; i < newArray.length; i++)
        {
            if (max < newArray[i])
            {
                max = newArray[i];
            }
        }
        printArray(newArray);
        System.out.println("The max is : " + max);
    }

    /*
     * Array Algorithm #5.2: findMin
     *  creates an array filled with random numbers
     *  prints the array and the least number
     */
    public static void findMin()
    {
        int[] arr = createRandomArray(10,10);
        int min = arr[0];
        for (int value : arr) {
            if (min > value) {
                min = value;
            }
        }
        printArray(arr);
        System.out.println(min);
    }

    /*
     * Array Algorithm #6: Reverse Array
     *  creates an array filled with random numbers
     *  creates a new array of the same size
     *  copies elements from the first array into the new array in reverse order
     *  prints the original array and the new array
     *  returns the new array
     */
    public static int[] reverseArray()
    {
        int[] randomNumbers = createRandomArray(10,20);

        int arrayLength = randomNumbers.length;
        for (int j = 0; j < arrayLength; j++) {
            System.out.print(randomNumbers[j] + " ");
        }
        System.out.println();

        int[] reverseRandomNumbers = new int[arrayLength];

        for (int i = 0; i < 10; i++) {
            reverseRandomNumbers[i] = randomNumbers[arrayLength-1-i];
            System.out.print(reverseRandomNumbers[i] + " ");
        }
        return reverseRandomNumbers;
    }
    
    /*
     * Array Algorithm #6.1: Reverse Array (alternate way)
     *  creates an array filled with random numbers
     *  creates a new array of the same size
     *  copies elements from the first array into the new array in reverse order
     *  prints the original array and the new array
     *  returns the new array
     */
    public static int[] reverseArray2()
    {
        int[] array1 = createRandomArray( 5, 10 );
        int[] newArray = new int [array1.length];
        int counter = 0;
        for(int i = array1.length - 1; i >= 0; i--)
        {
            newArray[counter] = array1[i];
            counter += 1;
        }
        printArray(array1);
        System.out.println("\n\n");
        printArray(newArray);
        return newArray;
    }
}