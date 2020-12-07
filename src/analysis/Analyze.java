package analysis;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 上机实践：使用正则表达式作为分隔符提取计算总成绩
 *
 * @author MicroLOONG
 */

public class Analyze {

    /**
     * 计算总成绩
     *
     * @param string 待解析字符串
     * @return totalScore 总成绩
     */
    public static double getTotalScore(String string) {
        Scanner scanner = new Scanner(string);
        scanner.useDelimiter("[^0-9.]+");
        double totalScore = 0;
        while (scanner.hasNext()) {
            try {
                double score = scanner.nextDouble();
                totalScore += score;
            } catch (InputMismatchException e) {
                scanner.next();
            }
        }
        return totalScore;
    }
}

