package sort;
/**
 * 所有排序算法均按升序
 */

public class Sort {
    /**
     * 交换元素
     *
     * @param array   数组
     * @param target1 下标1
     * @param target2 下标2
     */
    private void swap(int[] array, int target1, int target2) {
        int temp = array[target1];
        array[target1] = array[target2];
        array[target2] = temp;
    }

    /**
     * 打印显示数组
     * @param array 数组
     */
    public void printArray(int[] array) {
        for (int temp:
                array) {
            System.out.print(temp + ", ");
        }
        System.out.print("\n");
    }

    /**
     * 冒泡排序
     * @param array 待排序数组
     */
    public void bubbleSort(int[] array) {
        int length = array.length;
        if (length == 0)
            return;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (array[j] > array[j + 1])
                    swap(array, j, j + 1);
            }
        }
    }

    /**
     * 选择排序
     * @param array 待排序数组
     */
    public void selectSort(int[] array) {
        int length = array.length;
        if (length == 0)
            return;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            if (minIndex != i)
                swap(array, i, minIndex);
        }
    }
    /**
     * 插入排序
     * @param array 待排序数组
     */
    /*
    public void insertSort(int[] array) {
        int length = array.length;
        if (length == 0)
            return;
        for (int i = 1; i < length; i++) {

        }
    }

    public static void main(String[] args) {
        //用于测试的数组
        int[] array = {4, 5, 1, 35, 12, 4, 6, 99, 123, 55};
        Sort sort = new Sort();
        sort.printArray(array);
        //冒泡
        //sort.bubbleSort(array);
        sort.selectSort(array);
        sort.printArray(array);
    }*/
}
