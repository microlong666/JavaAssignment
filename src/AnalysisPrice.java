import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

/**
 * 解析商品列表并计算平均价格
 *
 * @author MiroLOONG
 */

public class AnalysisPrice {

    public static void main(String[] args) {
        File file = new File("src/commodity.txt");
        int count = 0;
        double sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[^0-9.]+");
            while (scanner.hasNextDouble()) {
                try {
                    double price = scanner.nextDouble();
                    System.out.println(price);
                    count++;
                    sum += price;
                } catch (InputMismatchException e) {
                    scanner.next();
                }
            }
            System.out.println("平均价格: " + sum / count);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
