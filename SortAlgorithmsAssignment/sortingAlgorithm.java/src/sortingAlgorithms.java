import java.util.concurrent.TimeUnit;

public class sortingAlgorithms {
    public static void main(String[] args) throws Exception {
        int[] test = new int[10000];

        for (int i = 0; i < test.length; i++) {
            int randomInt = (int) (Math.floor(Math.random() * (10000 - 1 + 1)) + 1);
            test[i] = randomInt;
        }
    
        long startTimeInsertion = System.nanoTime();
        int[] insertionSorted = insertionSort(test, test.length);
        long endTimeInsertion = System.nanoTime();

        System.out.println("Total time of Insertion sort: " + (endTimeInsertion - startTimeInsertion) + " nano seconds,");
        System.out.println("or " + TimeUnit.NANOSECONDS.toMillis(endTimeInsertion - startTimeInsertion) + " milliseconds.");

        long startTimeBubble = System.nanoTime();
        int[] bubbleSorted = bubbleSort(test, test.length);
        long endTimeBubble = System.nanoTime();

        System.out.println("Total time of Bubble sort: " + (endTimeBubble - startTimeBubble) + " nano seconds,");
        System.out.println("or " + TimeUnit.NANOSECONDS.toMillis(endTimeBubble - startTimeBubble) + " milliseconds.");

        // Test for printing the values to console

        // Insertion Sort
        // for (int i = 0; i < insertionSorted.length; i++) {
        //     System.out.print(insertionSorted[i] + " ");
        // }

        // Bubble Sort
        // for (int i = 0; i < bubbleSorted.length; i++) {
        //     System.out.print(bubbleSorted[i] + " ");
        // }


    }

    public static int[] insertionSort(int[] list, int num) {
        int[] inList = list;
        for (int i = 1; i < num; i++) {
            int val = inList[i];
            int j = i - 1;

            while (j >= 0 && val < inList[j]) {
                inList[j + 1] = inList[j];
                j--;
            }
            inList[j + 1] = val;
        }
        return inList;
    }

    public static int[] bubbleSort(int[] list, int num) {
        int[] inList = list;

        for (int i = 0; i < num - i - 0; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (inList[j] > inList[j + 1]) {
                    int temp = inList[j];
                    inList[j] = inList[j + 1];
                    inList[j + 1] = temp; 
                }
            }
        }

        return inList;
    }
}
