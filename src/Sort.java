import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * 排序算法
 *
 * @author MicroLOONG
 */

public class Sort {

    public static void main(String[] args) {
        Sort sort = new Sort();
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("输入五个整数：");
        try {
            // 判断输入是否为整数
            if (scanner.hasNextInt()) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = scanner.nextInt();
                }
                // 方法1：自带排序 (Dual-Pivot Quicksort)
                Arrays.sort(arr);
                System.out.println(Arrays.toString(arr));
                // 方法2：快速排序
                sort.quickSort(arr, 0, arr.length - 1);
                sort.output(arr);
                // 方法3：冒泡排序
                sort.bubbleSort(arr);
                sort.output(arr);
                // 方法4：选择排序
                sort.selectSort(arr);
                sort.output(arr);
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("输入异常，请重试");
        }
    }

    /**
     * 快排算法
     *
     * @param arr   整型数组
     * @param left  左边元素的数组下标，初始值为 0
     * @param right 左边元素的数组下标，初始值为 arr.length - 1
     */
    public void quickSort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int i = left;
        int j = right;

        // 定义枢轴元素并初始化为数组中第一个元素
        int data = arr[left];

        // 以 data 为中间数的二分查找
        while (i < j) {
            // 从右往左找比枢轴元素小的数并赋值给 left 当前位置
            while (i < j && data <= arr[j]) {
                j--;
            }
            arr[i] = arr[j];

            // 从左往右找比枢轴元素大的数并赋值给 right 当前位置
            while (i < j && data >= arr[i]) {
                i++;
            }
            arr[j] = arr[i];

            // left 和 right 相遇后将枢轴元素赋值给当前位置
            arr[i] = data;

            // 处理左边部分
            quickSort(arr, left, i - 1);
            // 处理右边部分
            quickSort(arr, i + 1, right);
        }
    }

    /**
     * 冒泡排序算法
     *
     * @param arr 整型数组
     */
    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 选择排序算法
     *
     * @param arr 整型数组
     */
    public void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    /**
     * 遍历输出
     *
     * @param arr 已排序数组
     */
    public void output(int[] arr) {
        for (int array : arr) {
            System.out.print(array + " ");
        }
        System.out.println();
    }
}
