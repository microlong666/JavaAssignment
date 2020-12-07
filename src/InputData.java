import java.util.Scanner;

/**
 * 上机实践：计算产品总价值
 *
 * @author MicroLOONG
 */

public class InputData {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int amount;
        float price;
        float sum;
        System.out.println("输入产品数量（回车确认）：");
        amount = reader.nextInt();
        System.out.println("输入产品单价（回车确认）：");
        price = reader.nextFloat();
        sum = price * amount;
        System.out.printf("数量：%d，单价：%5.2f，总价值：%5.2f", amount, price, sum);
    }
}
