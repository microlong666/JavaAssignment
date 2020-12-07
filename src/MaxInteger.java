/**
 * 1 + 2! + 3! + ... + n! <= 9876，求 n 的值
 *
 * @author MicroLOONG
 */

public class MaxInteger {

    public static void main(String[] args) {
        int max = 9876;
        int n = 0;
        // 项
        int item = 1;
        // 和
        int sum = 0;
        while (sum <= max) {
            n++;
            // 阶乘后的项
            item *= n;
            sum += item;
        }
        // n++后才退出循环，需要减回1次；
        System.out.println(n - 1);
    }
}
