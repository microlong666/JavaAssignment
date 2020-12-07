import java.util.*;

/**
 * 上机实践 - 练习：输入若干数字，回车确认，输入非数字字符(串)结束，计算这些数的和与平均值
 *
 * @author MicroLOONG
 */

public class LianXi {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        // 判断输入的数是否为double类型
        while (reader.hasNextDouble()) {
            double x = reader.nextDouble();
            m++;
            sum += x;
        }
        System.out.printf("%d个数的和为%f\n", m, sum);
        System.out.printf("%d个数的平均值是%f\n", m, sum / m);
    }
}
