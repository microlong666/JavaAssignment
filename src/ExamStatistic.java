import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 使用 Scanner 类的实例解析字符串中的考试成绩，并计算总成绩和平均分
 *
 * @author MicroLOONG
 */

public class ExamStatistic {

    public static void main(String[] args) {
        String string = "数学87分，物理76分，英语96分";
        Scanner scanner = new Scanner(string);
        // 匹配所有非数字字符串
        scanner.useDelimiter("[^0-9.]+");
        double sum = 0;
        int count = 0;
        while (scanner.hasNext()) {
            try {
                double score = scanner.nextDouble();
                // 统计个数
                count++;
                // 总成绩计算
                sum += score;
            } catch (InputMismatchException e) {
                // 异常处理，返回非数字字符
                scanner.next();
            }
        }
        System.out.println("总成绩: " + sum);
        System.out.println("平均分: " + sum / count);
    }
}
