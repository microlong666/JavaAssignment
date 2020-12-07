/**
 * 完数：所有的真因子（除自身以外的约数）的和，恰好等于它本身。
 *
 * @author MicroLOONG
 */

public class PerfectNumber {

    public static void main(String[] args) {
        // 1000 内完数
        int max = 1000;
        for (int i = 1; i <= max; i++) {
            // 每次循环保持初值为0
            int perfectNumber = 0;
            for (int j = 1; j < i; j++) {
                // 判断j是否为i的因子
                if (i % j == 0) {
                    perfectNumber += j;
                }
            }
            // 判断因子的和与该数相等
            if (perfectNumber == i) {
                System.out.print(perfectNumber + " ");
            }
        }
    }
}
