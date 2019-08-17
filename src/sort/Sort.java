package sort;
/**
 * All Ascending
 */

public class Sort
{

    private static void swap(int[] array, int target1, int target2)
    {
        int temp = array[target1];
        array[target1] = array[target2];
        array[target2] = temp;
    }

    private static void printArray(int[] array)
    {
        for (int temp: array)
        {
            System.out.print(temp + ", ");
        }
        System.out.print("\n");
    }

    private static void bubbleSort(int[] array)
    {
        int length = array.length;
        if (length == 0)
            return;
        for (int i = 0; i < length - 1; i++)
        {
            for (int j = 0; j < length - 1 - i; j++)
            {
                if (array[j] > array[j + 1])
                    swap(array, j, j + 1);
            }
        }
    }

    private static void selectSort(int[] array)
    {
        int length = array.length;
        if (length == 0)
            return;
        for (int i = 0; i < length - 1; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < length; j++)
            {
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            if (minIndex != i)
                swap(array, i, minIndex);
        }
    }

    private static void insertSort(int[] array)
    {
        int length = array.length;
        if (length == 0)
            return;
        for (int i = 1; i < length; i++)
        {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    private static void quickSort(int[] array, int L, int R)
    {
        if (L < R)
        {
            int i = L, j = R, X = array[L];
            while (i < j)
            {
                while (i < j && array[j] >= X)
                    j--;
                if (i < j)
                    array[i++] = array[j];
                while (i < j && array[i] < X)
                    i++;
                if (i < j)
                    array[j--] = array[i];
            }
            array[i] = X;
            quickSort(array, L, i - 1);
            quickSort(array, i + 1, R);
        }
    }

    public static void main(String[] args)
    {
        int[] array = {4, 5, 1, 35, 12, 4, 6, 99, 123, 55};

        int[] workArray = array.clone();
        printArray(workArray);
        bubbleSort(workArray);
        printArray(workArray);

        workArray = array.clone();
        printArray(workArray);
        selectSort(workArray);
        printArray(workArray);

        workArray = array.clone();
        printArray(workArray);
        insertSort(workArray);
        printArray(workArray);

        workArray = array.clone();
        printArray(workArray);
        quickSort(workArray,0,workArray.length - 1);
        printArray(workArray);
    }
}
